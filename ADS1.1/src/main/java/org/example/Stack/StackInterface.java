package org.example.Stack;

public interface StackInterface<T> {
    public boolean isEmpty();
    public T peek();
    public T pop();
    public void push(T item);
}
