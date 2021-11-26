package com;

import com.tomslists.GenericArrayList;
import com.vehicles.Audi;
import com.vehicles.Honda;
import com.vehicles.Vehicle;

public class Main {

    public GenericArrayList<Vehicle> vehiclesInTomArray = new GenericArrayList<>();

    public static void main(String[] args) {

         Main main = new Main();
         main.addCarToTomArrayList();
         main.printFromTomArrayList();

    }

    public void addCarToTomArrayList(){
        vehiclesInTomArray.add(new Audi( "08D23678", 200,1900,1567,"A6",false ));
        vehiclesInTomArray.add(new Honda( "11L23456", 150,1400, 1678, "Accord", false));
        vehiclesInTomArray.add(new Audi( "08D23238", 211,1700,1467,"A4",false ));
        vehiclesInTomArray.add(new Honda( "13L23456", 110,1200, 1378, "Civic", false));
    }


    public <T> void printFromTomArrayList(){
        int noOfCars = 1;
        for (int index = 0; index < vehiclesInTomArray.size(); index++){
            System.out.println("--------------------------------------------------"+"\n"+ noOfCars+". "+vehiclesInTomArray.get(index));
            noOfCars++;
        }
    }
}
