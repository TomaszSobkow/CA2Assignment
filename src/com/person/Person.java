package com.person;

import com.comparators.PersonComparable;
import com.comparators.PersonComparator;

public class Person implements PersonComparable<Person> {

    private int age;
    private String surName;
    private String name;

    public Person(int age, String surName, String name) {
        this.age = age;
        this.surName = surName;
        this.name = name;
    }

    /**
     * This equals method compare object by all instant fields.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        Person tempPerson ;
        int tempAge = 1;

        if(o instanceof Person){
            tempPerson = (Person)o;
            if(tempPerson.getName().equals(this.getName()) && tempPerson.getSurName().equals(this.getSurName())){
               tempAge =   Integer.compare(tempPerson.getAge(), this.getAge());
            }
        }
        return tempAge == 0;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }


    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getSurName() { return surName; }
    public void setSurName(String surName) { this.surName = surName; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Person{ " +
                "FirstName ='" + name +'\''+
                ", SureName='" + surName + '\'' +
                ", Age='" + age +'\''+
                '}';
    }


}
