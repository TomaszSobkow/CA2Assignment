package com.vehicles;

import com.comparators.CarComparable;
import com.vehicles.carinterfaces.Acceleration;
import com.vehicles.carinterfaces.Consumption;

public abstract class Vehicle implements CarComparable {

    protected Acceleration acceleration;
    protected Consumption consumption;

    private String regNumber;
    private Integer enginePower;
    private Integer engineSize;
    public  Integer weight;
    private String model;


    public Vehicle(String regNumber, Integer enginePower, Integer engineSize, Integer weight, String model) {
        this.regNumber = regNumber;
        this.enginePower = enginePower;
        this.engineSize = engineSize;
        this.weight = weight;
        this.model = model;
    }

    @Override
    public int compareTo(Vehicle vehicle) {
        return (this.regNumber.compareTo(vehicle.getRegNumber()));
    }

    @Override
    public String toString() {
        return   "" + model +
                "\nEnginePower      :  " + enginePower + " Hp" +
                "\nEngineSize       :  " + engineSize + " cm3"+
                "\nWei    ght       :  " + weight + " kg"+
                "\nRegNumber        :  " + regNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return (this.regNumber.equals(vehicle.regNumber) ) && (this.model.equals(vehicle.model));
    }


    public String getRegNumber() { return regNumber; }
    public void setRegNumber(String regNumber) { this.regNumber = regNumber; }

    public Integer getEnginePower() { return enginePower; }
    public void setEnginePower(Integer enginePower) { this.enginePower = enginePower; }

    public Integer getEngineSize() { return engineSize; }
    public void setEngineSize(Integer engineSize) { this.engineSize = engineSize; }

    public Integer getWeight() { return weight; }
    public void setWeight(Integer weight) { this.weight = weight; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
}

