package com.tomslists;

import com.exceptions.MyException;
import com.interfaces.IList;
import java.util.Iterator;


public class GenericArrayList<T>  implements IList<T> , Iterable<T>{

        private T[] buffer;
        private int nextFree ;
        private int currentArrayCapacity;
        private final int initArray = 1;

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
        public  void set(int index, T element) {
               if(index < nextFree){
                        buffer[index] = element;
               }else {
                       System.out.println("There is no Object on index " + index);
               }
        }

        @Override
        public Iterator<T> iterator() {
                return (Iterator<T>) new IteratorForGenericArrayList(); }

        @Override
        public boolean isEmpty() {
                return nextFree == 0 ;
        }

        @Override
        public int  size() {
                return nextFree; }

        @Override
        public T get(int index) {
                if( index >= nextFree){
                        System.out.println("No Object on index " + index);
                        return null;
                }
                return buffer[index];
        }

        @Override
        public  void remove(int objectPosition) throws MyException {
                int index = objectPosition -1;
                if(index < nextFree  && index >= 0  ){
                        System.out.println("\nThe OBJECT  "+ buffer[index] + " REMOVED !!!" );
                        for(int i = index; i < nextFree; i++){
                                buffer[i] = buffer[i + 1];
                        }
                        nextFree--;
                }else {
                        throw new MyException("There is no object on position  "+ objectPosition);
                }
        }

        @Override
        public boolean remove(T element) {
                boolean isMatch =  false;
        for(int index = 0; index < nextFree; index++){
                if(buffer[index].equals(element)) {
                        isMatch = true;
                        for(int i = index; i < nextFree; i++){
                                buffer[i] = buffer[i +1];
                        }
                        System.out.println("\n****************\nOBJECT "+"\n"+
                                           element +"\nFOUND AND REMOVED !!\"\n****************");
                        nextFree--;
                }
        }
        if(!isMatch){
                System.out.println( "\nUNKNOWN OBJECT -> "+element );
        }
        return isMatch;
        }

        @Override
        public boolean contains(T element) {
                boolean isMatch = false;
                for(int index = 0; index < nextFree; index++){
                        if(buffer[index].equals(element)){
                                isMatch = true;
                        }
                }
                return isMatch; }



        public int getNextFree() {
                return nextFree;
        }
        public T[] getBuffer() {
                return buffer;
        }

}
