package com.comparators;

import com.person.Person;

public class PersonAgeComparator implements PersonComparator<Person>{

    @Override
    public int compare(Person person1, Person person2) {
        return person1.getAge() - person2.getAge();
    }
}
