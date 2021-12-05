package com.interfaces;

public interface IQueue<T> {

    void enqueue(T element);
    T dequeue();
    T first();
    boolean empty();


}
