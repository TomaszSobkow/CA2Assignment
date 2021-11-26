package com.tomslists;

import com.exceptions.MyException;
import com.interfaces.IList;
import java.util.Iterator;

public class GenericArrayList<T>  implements IList<T> {

        private T[] buffer;
        private int nextFree;
        private int currentArrayCapacity;
        private final int initArray = 2;

        @SuppressWarnings("unchecked")
        public GenericArrayList(){
                currentArrayCapacity = initArray;
                nextFree = 0;
                buffer = (T[]) new Object[currentArrayCapacity];
        }

        @Override
        public void add(T element) {
                try {
                        extendArraySize();
                } catch (MyException e) {
                        e.printStackTrace();
                }
                buffer[nextFree++] = element;
        }

        @Override
        public void add(int index, T element) {
                if(index <= nextFree){
                        try {
                                extendArraySize();
                        } catch (MyException e) {
                                e.printStackTrace();
                        }
                        for(int i = nextFree; i > index; i++){
                        buffer[i] = buffer[i -1 ];
                        }
                }
                buffer[index] = element;
                nextFree++;
        }

        @SuppressWarnings("unchecked")
        private void extendArraySize() throws MyException {
                if(nextFree == currentArrayCapacity){
                        T[] tempArray = (T[])new Object[buffer.length *2];
                        currentArrayCapacity *=2;
                        for(int i = 0; i < buffer.length; i++){
                                tempArray[i] = buffer[i];
                        }
                buffer = tempArray;
                }
        }

        @Override
        public T set(int index, T element) {
                return null; }

        @Override
        public Iterator<T> iterator() {
                return null; }

        @Override
        public boolean isEmpty() {
                return nextFree == 0 ;
        }

        @Override
        public int size() {
                return nextFree; }

        @Override
        public T get(int index) {
                if( index >= nextFree){
                        return null;
                }
                return buffer[index];
        }

        @Override
        public  void remove(int index) {
                if(index <= nextFree){
                        for(int i = index; i < nextFree; i++){
                                buffer[i] = buffer[i + 1];
                        }
                        nextFree--;
                }
        }

        @Override
        public void remove(T element) {
                boolean isMatch =  false;
        for(int index = 0; index < nextFree && isMatch; index++){
                if(buffer[index].equals(element)) {
                        isMatch = true;
                        for(int i = index; i < nextFree; i++){
                                buffer[i] = buffer[i +1];
                        }
                        nextFree--;
                }
        }
        }

        @Override
        public boolean contains(T element) {

                boolean isMatch = false;
                for(int index = 0; index < nextFree && !isMatch; index++){
                        isMatch = true;
                }
                return isMatch; }



}
