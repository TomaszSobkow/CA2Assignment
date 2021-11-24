package com.tomslists;

import com.interfaces.IList;

import java.util.Iterator;

public class TomsLinkedList<T> implements IList<T> {

        @Override
        public void add(T element) { }

        @Override
        public void add(int index, T element) {  }

        @Override
        public T set(int index, T element) { return null; }

        @Override
        public T get(int index) { return null; }

        @Override
        public T remove(int index) { return null; }

        @Override
        public int size() { return 0; }

        @Override
        public boolean remove(T element) { return false; }

        @Override
        public boolean isEmpty() { return false; }

        @Override
        public boolean contains(T element) { return false; }

        @Override
        public Iterator<T> iterator() { return null; }
}

