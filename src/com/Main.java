package com;

import com.tomslists.TomsArrayList;
import com.vehicles.Audi;
import com.vehicles.Honda;
import com.vehicles.Vehicle;
import java.util.ArrayList;

public class Main {

    public ArrayList<Vehicle> vehicles = new ArrayList<>();
    public TomsArrayList<Vehicle> vehiclesInTomArray = new TomsArrayList<>();

    public static void main(String[] args) {

         Main main = new Main();
         main.addCarToArray();
        // main.printAllVehicles();
         main.printFromTomArrayList();
    }

    public void addCarToArray(){
        vehicles.add(new Audi( "08D23678", 200,1900,1567,"A6",false ));
        vehicles.add(new Honda( "11L23456", 150,1400, 1678, "Accord", false));
        System.out.println("Compare" + vehicles.get(0).compareTo(vehicles.get(1)));
    }

    public void addCarToTomArrayList(){
        vehiclesInTomArray.add(new Audi( "08D23678", 200,1900,1567,"A6",false ));
        vehiclesInTomArray.add(new Honda( "11L23456", 150,1400, 1678, "Accord", false));
    }

    public void printAllVehicles(){
        int noOfCars = 1;
        for (int index = 0; index > vehiclesInTomArray.size(); index++){
            System.out.println(vehiclesInTomArray.get(index));
        }
    }

    public void printFromTomArrayList(){
        int noOfCars = 1;
        for (Vehicle v : vehiclesInTomArray){
            System.out.println("--------------------------------------------------"+"\n"+ noOfCars+". "+v);
            noOfCars++;
        }
    }
}
