package com.vehicles.techvalues;

import com.vehicles.carinterfaces.Acceleration;
import java.text.DecimalFormat;

public class AccelerateTo100Kph implements Acceleration {

    //This method is under construction
    @Override
    public float accelerationTo100Km(int enginePower, int engineSize) {
        DecimalFormat value = new DecimalFormat("#.#");
        return Float.parseFloat( value.format((float) engineSize/enginePower));
    }
}
