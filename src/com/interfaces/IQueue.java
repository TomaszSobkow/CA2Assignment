package com.interfaces;

public interface IQueue<T> {

    public void enque(T element);
    public T dequeu();
    public T first();
    public boolean empty();
}
