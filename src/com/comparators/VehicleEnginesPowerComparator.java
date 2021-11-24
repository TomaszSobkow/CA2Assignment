package com.comparators;

import com.vehicles.Vehicle;

public class VehicleEnginesPowerComparator implements CarComparator<Vehicle>{
    @Override
    public int compare(Vehicle car1, Vehicle car2) {
        return car1.getEngineSize() - car2.getEngineSize();
    }
}
