CREATE TABLE IF NOT EXISTS Students
(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name TEXT,
    age INT,
    city TEXT,
    experience_months INT
);

INSERT INTO Students (name, age, city, experience_months)
VALUES
        ('Vadym Dovbnya', 32, 'Frankfurt', 4),
        ('Anton Lappa', 29, 'Coswig', 7),
        ('Yuliana Zeller', 33, 'Berlin', 4),
        ('Eugen Holodiuc', 31, 'Frankfurt', 12),
        ('Nina Voronetskaja', 30, 'Mannheim', 12),
        ('Mykola Digtiar', 28, 'Berlin', 131);

SELECT * FROM Students LIMIT 3;

SELECT * FROM Students WHERE age > 31 AND age < 32;

SELECT * FROM Students WHERE age = 30 OR city = 'Berlin' OR experience_months = '4';

UPDATE Students SET age = 29 WHERE city = 'Coswig';

DELETE FROM Students WHERE experience_months = 131;

ALTER TABLE Students ADD Grade INT NOT NULL DEFAULT 100;

ALTER TABLE Students DROP COLUMN Grade;

ALTER TABLE Students
Alter COLUMN experience_months TYPE TEXT;

SELECT DISTINCT name, age FROM Students;

SELECT COUNT(age) FROM Students;

SELECT * FROM Students ORDER BY experience_months;

SELECT MIN(age) FROM Students;

SELECT MAX(experience_months) FROM Students;

SELECT SUM(age) FROM Car WHERE age > 30;

SELECT AVG(experience_months) FROM Students where experience_months > 5;

DROP TABLE IF EXISTS Students;





