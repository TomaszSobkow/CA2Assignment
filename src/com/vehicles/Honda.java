package com.vehicles;

import com.vehicles.techvalues.AccelerateTo100Kph;
import com.vehicles.techvalues.FuelConsumption;
import java.util.Objects;

public class Honda extends Vehicle{

    private boolean isHybrid;
    private String isHybridToString = "No";

    public Honda(String regNumber, Integer enginePower, Integer engineSize, Integer weight, String model, boolean isHybrid) {
        super(regNumber, enginePower, engineSize, weight, model);
        this.isHybrid = isHybrid;

        if(isHybrid) isHybridToString = "Yes";

        super.acceleration = new AccelerateTo100Kph();
        super.consumption = new FuelConsumption();
    }

    @Override
    public String toString() {
        return "Honda " +super.toString()+
                "\n0 - 100km/h      :  " + acceleration.accelerationTo100Km( getEnginePower(), getEngineSize() )+ "s"+
                "\nConsumption      :  " + consumption.averageConsumption(getWeight(), getEngineSize())+" l/100km"+
                "\nisHybrid         :  " + isHybridToString ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Honda)) return false;
        if (!super.equals(o)) return false;
        Honda honda = (Honda) o;
        return isHybrid == honda.isHybrid;
    }


}
