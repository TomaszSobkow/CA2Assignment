package com.comparators;

import com.vehicles.Vehicle;

public class VehicleWeightComparator implements CarComparator{
    @Override
    public int compare(Vehicle car1, Vehicle car2) {
        return ( car1.getWeight() - car2.getWeight() );
    }
}
