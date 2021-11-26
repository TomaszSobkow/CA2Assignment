package com.tomslists;

import com.interfaces.IList;
import java.util.Iterator;

public class GenericLinkedList<T> implements IList<T> {



        @Override
        public void add(T element) { }

        @Override
        public void add(int index, T element) {  }

        @Override
        public T set(int index, T element) { return null; }

        @Override
        public T get(int index) { return null; }

        @Override
        public void remove(int index) {

        }

        @Override
        public int size() { return 0; }

        @Override
        public void remove(T element) {}

        @Override
        public boolean isEmpty() { return false; }

        @Override
        public boolean contains(T element) { return false; }

        @Override
        public Iterator<T> iterator() { return null; }
}

