package com.comparators;

import com.vehicles.Vehicle;

public interface CarComparator <T> {

    int compare(Vehicle car1, Vehicle car2);
}
