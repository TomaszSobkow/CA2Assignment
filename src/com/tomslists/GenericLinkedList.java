package com.tomslists;

import com.interfaces.IList;
import java.util.Iterator;

public class GenericLinkedList<T> implements IList<T> {

         private Node head;

         public void addToStart(int value){
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
        public void add(T element) { }

        @Override
        public void add(int index, T element) {  }

        @Override
        public void set(int index, T element) {  }

        @Override
        public T get(int index) { return null; }

        @Override
        public void remove(int index) {  }

        @Override
        public int size() { return 0; }

        @Override
        public boolean remove(T element) {return true;}

        @Override
        public boolean isEmpty() { return false; }

        @Override
        public boolean contains(T element) { return false; }

        @Override
        public Iterator<T> iterator() { return null; }
}

