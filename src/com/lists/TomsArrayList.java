package com.lists;

import com.interfaces.IList;

import java.util.Iterator;

public class TomsArrayList<T> implements IList<T> {

        @Override
        public void add(Object element) {

        }

        @Override
        public void add(int index, Object element) {  }

        @Override
        public void set(int index, Object element) {  }

        @Override
        public Iterator iterator() {
            return IList.super.iterator();
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public int size() { return 0; }

        @Override
        public T get(int index) { return null; }

        @Override
        public T remove(int index) { return null; }

        @Override
        public boolean remove(Object element) { return false; }

        @Override
        public boolean contains(Object element) { return false; }

}
