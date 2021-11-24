package com.interfaces;

public interface IStack<T> {

    public T push(T element);
    public T pop();
    public T peek();
    public boolean empty();

}
