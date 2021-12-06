package com.comparators;


public interface PersonComparator <T> {

    /**
     *Implemented in CompareSureName class in this folder
     * */
    int compare(T element1, T element2);
}
