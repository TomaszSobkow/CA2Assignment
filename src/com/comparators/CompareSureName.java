package com.comparators;

import com.person.Person;

public class CompareSureName implements PersonComparator<Person>{

    @Override
    public int compare(Person element1, Person element2) {
        return  element1.getSurName().compareTo(element2.getSurName());
    }
}
