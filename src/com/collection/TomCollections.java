package com.collection;


import com.comparators.PersonComparator;
import com.person.Person;
import com.tomslists.GenericArrayList;


public class TomCollections {

    public static void sort(GenericArrayList<Person> personsToSort){
        for (int index = 0; index < personsToSort.size(); index++){
            for(int i = 0; i < personsToSort.size() -1 -index; i++){
                if(personsToSort.get(i).compareTo(personsToSort.get( i+1 )) > 0){
                    Person tempPerson = personsToSort.get(i);
                    personsToSort.set(i, personsToSort.get( i+1 ));
                    personsToSort.set( i+1 , tempPerson);
                }
            }
        }
    }

    public static void sort(GenericArrayList<Person> personListToSort, PersonComparator comparator){
        for (int index = 0; index < personListToSort.size(); index++){
            for(int innerIndex = 0; innerIndex < personListToSort.size() - 1 - index; innerIndex++){
                if(comparator.compare(personListToSort.get(innerIndex), personListToSort.get(innerIndex +1)) > 0){
                    Person tempPerson = personListToSort.get(innerIndex);
                    personListToSort.set( innerIndex, personListToSort.get(innerIndex + 1));
                    personListToSort.set( innerIndex+1, tempPerson );
                }
            }
        }
    }
}
