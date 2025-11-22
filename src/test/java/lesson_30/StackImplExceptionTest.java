package lesson_30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.Stack;

class StackImplExceptionTest {

    @Test
    void shouldThrowExceptionWhenAddElement() throws StackFullException {
        //given
        StackImpl stack = new StackImpl(2);
        stack.addElement(23);
        stack.addElement(34);

        //when & then
        Assertions.assertThrows(StackFullException.class,
                () -> {
                    stack.addElement(4);
                });
    }

    @Test
    void shouldThrowExceptionWhenTakeOutElement() throws StackEmptyException {
        //given
        StackImpl stack = new StackImpl(3);

        // when & then
        Assertions.assertThrows(StackEmptyException.class,
                () -> {
                    stack.takeOutElement();
                });
    }

    @Test
    void shouldThrowExceptionWhenReadTop() throws StackEmptyException {
        //given
        StackImpl stack = new StackImpl(3);

        // when & then
        Assertions.assertThrows(StackEmptyException.class,
                () -> {
                    stack.readTop();
                });
    }

    @Test
    void shouldReturnEmptyOptionalWhenStackIsEmpty() {
        //given
        StackImpl stack = new StackImpl(2);

        //when
        Optional<Integer> result = stack.takeOutOptional();

        //then
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    void shouldReturnLastElementInOptionalWhenStackIsNotEmpty() throws StackFullException {
        //given
        StackImpl stack = new StackImpl(3);
        stack.addElement(12);
        stack.addElement(23);

        //when
        Optional<Integer> result = stack.takeOutOptional();

        //then
        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(Optional.of(23), result);
    }
}