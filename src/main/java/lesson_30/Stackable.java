package lesson_30;

public interface Stackable {

    boolean isEmpty();

    boolean isFull();

    void addElement(int element);

    Integer takeOutElement();

    Integer readTop();

    void printStack();

    void clear();
}
