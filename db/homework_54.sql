--One to one
CREATE TABLE IF NOT EXISTS Student
(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name TEXT,
    age INT,
    city TEXT,
    experience_months INT
);

CREATE TABLE IF NOT EXISTS Student_Contact
(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    email TEXT NOT NULL UNIQUE,
    phone TEXT NOT NULL UNIQUE,
    student_id UUID NOT NULL UNIQUE REFERENCES Student(id)
);

--One to many

CREATE TABLE IF NOT EXISTS Homework
(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    title TEXT NOT NULL UNIQUE,
    due_date DATE,
    student_id UUID NOT NULL REFERENCES Student(id)
);

--Many to many

CREATE TABLE IF NOT EXISTS Teacher
(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS Student_Teacher
(
    student_id UUID NOT NULL REFERENCES Student(id),
    teacher_id UUID NOT NULL REFERENCES Teacher(id),
    PRIMARY KEY (student_id, teacher_id)
);