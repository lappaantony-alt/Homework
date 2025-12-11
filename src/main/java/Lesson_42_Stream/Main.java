package Lesson_42_Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        Student Leo = new Student("Leo", 24, 4.6);
        Student Mike = new Student("Mike", 17, 3.3);
        Student Donny = new Student("Donny", 19, 5.0);
        Student Raf = new Student("Raf", 22, 3.9);

        List<Student> students = List.of(Leo, Mike, Donny, Raf);

        System.out.println("Students with grade lower than 4.0:");
        students.stream()
                .filter(student -> student.getGrade() < 4.0)
                .map(Student::getName)
                .forEach(System.out::println);

        System.out.println("Students with highest grade:");
        Optional<Student> maxGrade = students.stream()
                .max(Comparator.comparingDouble(Student::getGrade));
        maxGrade.ifPresent(System.out::println);

        System.out.println("How many students older 20:");
        System.out.println(
                students.stream()
                        .filter(student -> student.getAge() > 20)
                        .count()
        );

        System.out.println("Students sorted by grade:");
        students.stream()
                .sorted(Comparator.comparingDouble(Student::getGrade).reversed())
                .map(Student::getName)
                .forEach(System.out::println);

        boolean theBest = students.stream()
                .anyMatch(student -> student.getGrade() == 5.0);
        System.out.println("If there at least one student with grade 5.0: " + theBest);

        System.out.println("Students with grade more than 4.0:");
        List<Student> gradeMoreThanFour = students.stream()
                .filter(student -> student.getGrade() > 4.0)
                .collect(Collectors.toList());
        System.out.println(gradeMoreThanFour);
    }
}

