package lesson_30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}