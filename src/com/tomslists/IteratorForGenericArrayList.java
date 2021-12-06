package com.tomslists;


import com.exceptions.MyException;
import com.person.Person;

import java.util.Iterator;

public class IteratorForGenericArrayList implements Iterator<Person> {

    private int indicator = 0;
    private GenericArrayList<Person> genericArrayList = new GenericArrayList<Person>();

    @Override
    public boolean hasNext() {
        return indicator < genericArrayList.getNextFree();
    }

    @Override
    public Person next() {
        if(indicator == genericArrayList.getNextFree()){
            try {
                throw  new MyException("No Such element for iterate");
            } catch (MyException e) {
            }
        }

        return (Person) genericArrayList.getBuffer()[indicator++];
    }
}
