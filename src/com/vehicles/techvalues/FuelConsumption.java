package com.vehicles.techvalues;

import com.vehicles.carinterfaces.Consumption;
import java.text.DecimalFormat;

public class FuelConsumption implements Consumption {

    @Override
    public float averageConsumption( int weight, int engineSize) {
        DecimalFormat value = new DecimalFormat("#.#");
        return Float.parseFloat( value.format((float) engineSize/weight) )+4;
    }
}