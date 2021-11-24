package com.vehicles;

import com.vehicles.techvalues.AccelerateTo100Kph;
import com.vehicles.techvalues.FuelConsumption;
import java.util.Objects;

public class Audi extends Vehicle{

    private boolean is4Drive;
    private String is4DriveToString = "No";

    public Audi(String regNumber, Integer enginePower, Integer engineSize,
                Integer weight, String model, boolean is4Drive) {
        super(regNumber, enginePower, engineSize, weight, model);
        this.is4Drive = is4Drive;

        if(is4Drive) is4DriveToString = "Yes";

        super.acceleration = new AccelerateTo100Kph();
        super.consumption = new FuelConsumption();
    }

    @Override
    public String toString() {
        return "\tAudi " +super.toString()+
                "\n0 - 100km/h      :  " + acceleration.accelerationTo100Km( getEnginePower(), getEngineSize() )+ "s"+
                "\nConsumption      :  " + consumption.averageConsumption(getWeight(), getEngineSize())+ " l/100km"+
                "\n4Drive           :  " + is4DriveToString  ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Audi)) return false;
        if (!super.equals(o)) return false;
        Audi audi = (Audi) o;
        return isIs4Drive() == audi.isIs4Drive();
    }

    public boolean isIs4Drive() { return is4Drive; }
    public void setIs4Drive(boolean is4Drive) { this.is4Drive = is4Drive; }
}
