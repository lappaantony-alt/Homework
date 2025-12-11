package Lesson_42_Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    List<Student> students;


    @BeforeEach
    void setup() {
        students = List.of(
                new Student("Leo", 24, 4.6),
                new Student("Mike", 17, 3.3),
                new Student("Donny", 19, 5.0),
                new Student("Raf", 22, 3.9)
        );
    }

    @Test
    void shouldShowHowManyStudentWithGradeLessThanFour() {
        //given: List of student from @BeforeEach

        //when
        List<Student> result = students.stream()
                .filter(student -> student.getGrade() < 4.0)
                .toList();

        //then
        assertEquals(2, result.size());
    }

    @Test
    void shouldShowStudentWithHighestGrade() {
        //given: List of student from @BeforeEach

        //when
        Optional<Student> maxGrade = students.stream()
                .max(Comparator.comparingDouble(Student::getGrade));

        //then
        assertTrue(maxGrade.isPresent());
        assertEquals("Donny", maxGrade.get().getName());
    }

    @Test
    void shouldShowHowManyStudentOlderThanTwenty() {
        //given: List of student from @BeforeEach

        //when
        long count = students.stream()
                .filter(student -> student.getAge() > 20)
                .count();

        //then
        assertEquals(2, count);
    }

    @Test
    void shouldSortStudentListByGradeFromLowestToHighest() {
        //given: List of student from @BeforeEach

        //when
        List<String> sortedList = students.stream()
                .sorted(Comparator.comparingDouble(Student::getGrade).reversed())
                .map(Student::getName)
                .toList();

        //then
        assertEquals(List.of("Donny", "Leo", "Raf", "Mike"), sortedList);
    }

    @Test
    void shouldShowListOfStudenWithGradeHigherThanFour() {
        //given: List of student from @BeforeEach

        //when
        List<String> result = students.stream()
                .filter(student -> student.getGrade() > 4.0)
                .map(Student::getName)
                .toList();

        //then
        assertEquals(List.of("Leo", "Donny"), result);
    }

    @Test
    void shouldShowIfExistAnyStudentWithGradeFive() {
        //given: List of student from @BeforeEach

        //when
        boolean theBest = students.stream()
                .anyMatch(student -> student.getGrade() == 5.0);

        //then
        assertTrue(theBest);
    }
}