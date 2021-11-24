package com.tomslists;

import com.interfaces.IList;
import java.util.Iterator;

public class TomsArrayList<T> implements IList<T> {

        @Override
        public void add(Object element) {   }

        @Override
        public void add(int index, Object element) {  }

        @Override
        public T set(int index, T element) { return null; }

        @Override
        public Iterator<T> iterator() { return null; }

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
