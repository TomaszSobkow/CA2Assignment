package com.interfaces;

import com.exceptions.MyException;

import java.util.Iterator;

public interface IList <T> extends Iterable<T>{

    void add(T element);
    void add(int index, T element);
    void set(int index, T element);
    T get(int index);
    void remove(int objectPosition) throws MyException;
    int size();
    boolean remove(T element);
    boolean isEmpty();
    boolean contains(T element);


}
