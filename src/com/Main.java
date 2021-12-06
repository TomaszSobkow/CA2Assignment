package com;

import com.collection.TomCollections;
import com.comparators.CompareSurname;
import com.comparators.PersonComparator;
import com.exceptions.MyException;
import com.person.Person;
import com.tomslists.GenericArrayList;

import java.util.Properties;

public class Main {


    public GenericArrayList<Person> persons = new GenericArrayList<>();

    public static void main(String[] args) throws MyException {

        /**Creating test class object and population of arrayList of Person objects
         */
         Main main = new Main();
         main.addPersonToArrayList();
         Person newPerson = new Person(100, "TEST", "TEST");
         main.persons.add(newPerson);

         /**Printing all object in a GenericArrayList*/
         main.printFromTomArrayList("Original List:");

        /**
         * Persons GenericArrayList sorted by Age and reprinted
         */
        TomCollections.sort(main.persons);
        main.printFromTomArrayList("Sorted List based on natural ordering (age):");

        /**
         * Persons GenericArrayList sorted by surName
         */
        TomCollections.sort(main.persons, new CompareSurname());
        main.printFromTomArrayList("Sorted List based on natural ordering (SureName):");

        /**
         * Testing contains method from GenericArrayList
         *
         * testContainsMethod negative
         * newPerson positive
         */
        Person testContainsMethod = new Person(333,"unknown","unknown");
        if(main.persons.contains(newPerson)){
            System.out.println("\nOBJECT\n"+ newPerson+"\nFOUND ON THE LIST");
        }else {
            System.out.println("OBJECT\n" + newPerson+ "\nNOT FOUND ON THE LIST !!!");
        }


        /**Removing an object from existing arrayList and reprint all list*/
         main.persons.remove(1);
         main.printFromTomArrayList("Printing updated List");

        /**
         * Removing Object by object type and testing equals method
         */
        main.persons.remove(new Person(23,"",""));
        main.persons.remove(newPerson);
        main.printFromTomArrayList("Printing updated List");
    }

    /**Populate a GenericArrayList*/
    public void addPersonToArrayList(){
        persons.add(new Person(20, "Hegarty", "Dermot"));
        persons.add(new Person(23, "Minchin", "Tim"));
        persons.add(new Person(19, "DiCamillo", "Kate"));
        persons.add(new Person(28, "Hardinge", "Frances"));
        persons.add(new Person(24, "Bryson", "Bill"));
        persons.add(new Person(26, "Sobkow", "Thomas"));

    }


    public <T> void printFromTomArrayList(String message){
        System.out.println("\n\t"+ message);
        int noOfPersons = 1;
        for (int index = 0; index < persons.size(); index++){
            System.out.println( noOfPersons++ +". "+persons.get(index));
        }
    }
}
