package com.interfaces;

import java.util.Iterator;

public interface IList <T> extends Iterable<T>{

    public void add(T element);
    public void add(int index, T element);
    public T set(int index, T element);
    public T get(int index);
    public T remove(int index);
    public int size();
    public boolean remove(T element);
    public boolean isEmpty();
    public boolean contains(T element);
    public Iterator<T> iterator();



}
