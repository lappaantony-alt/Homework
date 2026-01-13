CREATE TABLE IF NOT EXISTS Student
(
    id                UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name              TEXT,
    age               INT,
    city              TEXT,
    experience_months INT
);

CREATE TABLE IF NOT EXISTS Student_Contact
(
    id         UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    email      TEXT NOT NULL UNIQUE,
    phone      TEXT NOT NULL UNIQUE,
    student_id UUID NOT NULL UNIQUE REFERENCES Student (id)
);

CREATE TABLE IF NOT EXISTS Homework
(
    id         UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    title      TEXT NOT NULL UNIQUE,
    due_date   DATE,
    student_id UUID NOT NULL REFERENCES Student (id)
);

CREATE TABLE IF NOT EXISTS Teacher
(
    id   UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name TEXT
);

CREATE TABLE IF NOT EXISTS Student_Teacher
(
    student_id UUID NOT NULL REFERENCES Student (id),
    teacher_id UUID NOT NULL REFERENCES Teacher (id),
    PRIMARY KEY (student_id, teacher_id)
);


INSERT INTO Student (name, age, city, experience_months)
VALUES ('Vadym Dovbnya', 32, 'Frankfurt', 4),
       ('Anton Lappa', 29, 'Coswig', 7),
       ('Yuliana Zeller', 33, 'Berlin', 4),
       (null, 43, 'Chervona Zorya', 1);

INSERT INTO Teacher (name)
VALUES ('Mykola Digtiar'),
       ('Nikita Mykhailov'),
       (null);

INSERT INTO Student_Teacher (student_id, teacher_id)
VALUES ((SELECT id FROM Student WHERE name = 'Vadym Dovbnya'),
        (SELECT id FROM Teacher WHERE name = 'Mykola Digtiar')),
       ((SELECT id FROM Student WHERE name = 'Anton Lappa'),
        (SELECT id FROM Teacher WHERE name = 'Nikita Mykhailov'));


SELECT s.name AS student, t.name AS teacher
FROM Student s
         INNER JOIN Student_Teacher st ON s.id = st.student_id
         INNER JOIN Teacher t ON t.id = st.teacher_id;

SELECT s.name AS student, t.name AS teacher
FROM Student s
         LEFT JOIN Student_Teacher st ON s.id = st.student_id
         LEFT JOIN Teacher t ON t.id = st.teacher_id;

SELECT s.name AS student, t.name AS teacher
FROM Student s
         RIGHT JOIN Student_Teacher st ON s.id = st.student_id
         RIGHT JOIN Teacher t ON t.id = st.teacher_id;

SELECT s.name AS student, t.name AS teacher
FROM Student s
         FULL JOIN Student_Teacher st ON s.id = st.student_id
         FULL JOIN Teacher t ON t.id = st.teacher_id;


