package edu.iutcs.cr.vehicles;

import java.io.Serializable;
import java.util.Scanner;

/**
 * @author Raian Rahman
 * @since 4/18/2024
 */
public class NullVehicle extends Vehicle implements Serializable {


    public NullVehicle() {
        super();
    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public void printVehicleAvailability(){
        System.out.println("Vehicle not available");
    }


}
