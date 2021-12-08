package com.tomslists;

import com.exceptions.MyException;
import com.interfaces.IList;
import java.util.Iterator;

public class GenericLinkedList<T> implements IList<T> {

         private Node head;
         private Node tail;

         private int noOfElements = 0;

         public void addToStart(T value){
                 Node firstNode = new Node(value);
                 firstNode.next = head;
                 head = firstNode;
         }

         public void printList(){
                 Node current = head;
                 while (current != null){
                         System.out.println(current.getData() + ",");
                         current = current.next;
                 }
         }

        @Override
        public void add(T element) {
                 Node newNode = new Node( element);
                 if(head == null){
                         head = newNode;
                         tail = newNode;
                 }else {
                         tail.next = newNode;
                         tail = newNode;
                 }

        }

        @Override
        public void add(int index, T element) {  }

        @Override
        public void set(int index, T element) {  }

        @Override
        public T get(int index) {
                 Node current = head;
                 if(head == null){
                         try {
                                 throw new MyException("");
                         } catch (MyException e) {
                                 e.printStackTrace();
                         }
                 }
                 return null; }

        @Override
        public void remove(int index) {  }

        @Override
        public int size() { return noOfElements; }

        @Override
        public boolean remove(T element) {return true;}

        @Override
        public boolean isEmpty() { return noOfElements == 0; }

        @Override
        public boolean contains(T element) { return false; }

        @Override
        public Iterator<T> iterator() { return null; }
}

