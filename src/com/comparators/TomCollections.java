package com.comparators;

import com.lists.TomsArrayList;
import com.vehicles.Vehicle;


public class TomCollections {

    public static void sort(TomsArrayList<Vehicle> vehicleListToSort){
        for (int index = 0; index < vehicleListToSort.size(); index++){
            for(int i = 0; i < vehicleListToSort.size() -1 -index; i++){
                if(vehicleListToSort.get(i).compareTo(vehicleListToSort.get( i+1 )) > 0){
                    Vehicle tempVehicle = vehicleListToSort.get(i);
                    vehicleListToSort.set(i, vehicleListToSort.get( i+1 ));
                    vehicleListToSort.set( i+1 , tempVehicle);
                }
            }
        }
    }

    public static void sort(TomsArrayList<Vehicle> vehiclesListToSort, CarComparator comparator){
        for (int index = 0; index < vehiclesListToSort.size(); index++){
            for(int innerIndex = 0; innerIndex < vehiclesListToSort.size() - 1 - index; innerIndex++){
                if(comparator.compare(vehiclesListToSort.get(innerIndex), vehiclesListToSort.get(innerIndex +1)) > 0){
                    Vehicle tempVehicle = vehiclesListToSort.get(innerIndex);
                    vehiclesListToSort.set( innerIndex, vehiclesListToSort.get(innerIndex + 1));
                    vehiclesListToSort.set( innerIndex+1, tempVehicle );
                }
            }
        }
    }
}
