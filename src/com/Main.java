package com;

import com.collection.TomCollections;
import com.comparators.CompareSureName;
import com.exceptions.MyException;
import com.interfaces.IList;
import com.person.Person;
import com.tomslists.GenericArrayList;
import com.tomslists.GenericLinkedList;

public class Main {

    public GenericArrayList<Person> arrayListPersons;
    public GenericLinkedList<Person> linkedListPersons = new GenericLinkedList<>();

    public Main(){
        arrayListPersons = new GenericArrayList();
    }

    public static void main(String[] args)  throws MyException{
       new Main().testGenericArrayList();
        //new Main().testGenericLinkedList();
    }


    /**
     * Use it to test GenericLinkedList
     */
    public void testGenericLinkedList(){
       Main linkedMain = new Main();
       linkedMain.addPersonToLinkedList();
        System.out.println("Added to linked list");
       //linkedListPersons.printList();

    }


    /**
     * Use it to test GenericArrayList
     */
    public void testGenericArrayList() throws MyException{
        /**Creating test class object and populate of arrayList of Person objects
         */
        Main main = new Main();
        main.addPersonToArrayList();
        Person newPerson = new Person(100, "TEST", "TEST");
        main.arrayListPersons.add(newPerson);

        /**Printing all object in a GenericArrayList*/
        main.printArrayList("Original List:");

        /**
         * Persons GenericArrayList sorted by Age and reprinted
         */
        TomCollections.sort( main.arrayListPersons);
        main.printArrayList("Sorted List based on natural ordering (age):");

        /**
         * Persons GenericArrayList sorted by sureName
         */
        TomCollections.sort( main.arrayListPersons, new CompareSureName());
        main.printArrayList("Sorted List based on natural ordering (SureName):");

        /**
         * Testing contains method from GenericArrayList
         * testContainsMethod negative
         * newPerson positive
         */
        Person testContainsMethod = new Person(333,"unknown","unknown");
        if(main.arrayListPersons.contains(testContainsMethod)){
            System.out.println("\nOBJECT\n"+ testContainsMethod+"\nFOUND ON THE LIST");
        }else {
            System.out.println("OBJECT\n" + testContainsMethod+ "\nNOT FOUND ON THE LIST !!!");
        }


        /**Removing an object from existing GenericArrayList and reprint all GenericArrayList*/
        main.arrayListPersons.remove(1);
        main.printArrayList("Printing updated List");

        /**
         * Removing Object by object type and testing equals method
         */
        main.arrayListPersons.remove(new Person(0,"",""));
        main.arrayListPersons.remove(newPerson);
        main.printArrayList("Printing updated GenericArrayList");
    }

    /**Populate a GenericArrayList*/
    public void addPersonToArrayList(){
        arrayListPersons.add(new Person(20, "Hegarty", "Dermot"));
        arrayListPersons.add(new Person(23, "Minchin", "Tim"));
        arrayListPersons.add(new Person(19, "DiCamillo", "Kate"));
        arrayListPersons.add(new Person(28, "Hardinge", "Frances"));
        arrayListPersons.add(new Person(24, "Bryson", "Bill"));
        arrayListPersons.add(new Person(26, "Sobkow", "Thomas"));

    }

    /**Populate a GenericArrayList*/
    public void addPersonToLinkedList(){
        linkedListPersons.add(new Person(20, "Hegarty", "Dermot"));
        linkedListPersons.add(new Person(23, "Minchin", "Tim"));
        linkedListPersons.add(new Person(19, "DiCamillo", "Kate"));
        linkedListPersons.add(new Person(28, "Hardinge", "Frances"));
        linkedListPersons.add(new Person(24, "Bryson", "Bill"));
        linkedListPersons.add(new Person(26, "Sobkow", "Thomas"));

    }

    public  void printArrayList(String message){
        System.out.println("\n\t"+ message);
        int noOfPersons = 1;
        for (int index = 0; index < arrayListPersons.size(); index++){
            System.out.println( noOfPersons++ +". "+ arrayListPersons.get(index));
        }
//        for(Person p : persons){
//            System.out.println(p);
//        }
    }

    //It doesn't work but don't know why!!
    public <T>void printList(String message, IList<T> listToPrint){
        System.out.println("\n\t"+ message);
        int noOfPersons = 1;
        System.out.println("size !!!!!"+ listToPrint.size());
        for (int index = 0; index < listToPrint.size(); index++){

            System.out.println( noOfPersons++ +". "+ listToPrint.get(index));
        }

    }
}
