CREATE TABLE IF NOT EXISTS Student
(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name TEXT,
    age INT,
    city TEXT,
    experience_months INT
);

INSERT INTO Student (name, age, city, experience_months)
VALUES
        ('Vadym Dovbnya', 32, 'Frankfurt', 4),
        ('Anton Lappa', 29, 'Coswig', 7),
        ('Yuliana Zeller', 33, 'Berlin', 4),
        ('Eugen Holodiuc', 31, 'Frankfurt', 12),
        ('Nina Voronetskaja', 30, 'Mannheim', 12),
        ('Mykola Digtiar', 28, 'Berlin', 131);

SELECT * FROM Student LIMIT 3;

SELECT * FROM Student WHERE age > 31 AND age < 32;

SELECT * FROM Student WHERE age = 30 OR city = 'Berlin' OR experience_months = 4;

UPDATE Student SET age = 29 WHERE city = 'Coswig';

DELETE FROM Student WHERE experience_months = 131;

ALTER TABLE Student ADD Grade INT NOT NULL DEFAULT 100;

ALTER TABLE Student DROP COLUMN Grade;

ALTER TABLE Student
Alter COLUMN experience_months TYPE TEXT;

ALTER TABLE Student
ALTER COLUMN experience_months TYPE INT USING experience_months::INT;

SELECT DISTINCT name, age FROM Student;

SELECT COUNT(age) FROM Student;

SELECT * FROM Student ORDER BY experience_months;

SELECT MIN(age) FROM Student;

SELECT MAX(experience_months) FROM Student;

SELECT SUM(age) FROM Student WHERE age > 30;

SELECT AVG(experience_months) FROM Student where experience_months > 5;

DROP TABLE IF EXISTS Student;





