package com.tomslists;

import com.interfaces.IList;
import com.interfaces.IQueue;
import com.interfaces.IStack;

public class GenericStack <T> implements IQueue, IStack {

    public IList<T> stackData = new GenericArrayList<>();


    @Override
    public void enqueue(Object element) { }
    @Override
    public Object dequeue() { return null; }
    @Override
    public Object first() { return null; }


    @Override
    public Object push(Object element) { return null; }
    @Override
    public Object pop() { return null; }
    @Override
    public Object peek() { return null; }

    @Override
    public boolean empty() { return false; }
}
