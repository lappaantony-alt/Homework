package lesson_30;

public interface Stackable {

    boolean isEmpty();

    boolean isFull();

    void addElement(int element) throws StackFullException;

    Integer takeOutElement() throws StackEmptyException;

    Integer readTop() throws StackEmptyException;

    void printStack();

    void clear();
}
