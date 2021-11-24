package com.comparators;

import com.vehicles.Vehicle;

public interface CarComparable<T>{

    int compareTo(Vehicle vehicle);
}
