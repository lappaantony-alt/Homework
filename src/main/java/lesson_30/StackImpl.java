package lesson_30;

import java.util.Optional;

public class StackImpl implements Stackable {

    private int maxSize;
    private int[] stackArr;
    private int top;

    public StackImpl(int max) {
        this.maxSize = max;
        stackArr = new int[maxSize];
        top = -1;
    }

    @Override
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if (top == maxSize - 1) {
            return true;
        }
        return false;
    }

    @Override
    public void addElement(int element) {
        if (isFull()) {
            throw new StackFullException("Easy, cowboy! This stack is already full🤠");
        } else {
            stackArr[++top] = element;
        }
    }

    @Override
    public Integer takeOutElement() {
        if (isEmpty()) {
            throw new StackEmptyException("Did you put anything there to take it out?🤨");
        }
        int element = stackArr[top];
        top--;
        return element;
    }

    @Override
    public Integer readTop() {
        if (isEmpty()) {
            throw new StackEmptyException("For check top, you have to put there something😉");
        }
        return stackArr[top];
    }

    @Override
    public void printStack() {
        if (isEmpty()) {
            System.out.println("I guess your forgot to fill in stack😅");
            return;
        }
        System.out.println("Stack content (don't forget about LIFO🤓)");
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArr[i]);
        }
    }

    @Override
    public void clear() {
        if (isEmpty()) {
            System.out.println("There is nothing to clean🫠");
        }
        top = -1;
    }

    @Override
    public Optional<Integer> takeOutOptional() {
        if (isEmpty()) {
            return Optional.empty();
        }
        Integer opt = stackArr[top];
        top--;
        return Optional.of(opt);
    }
}
