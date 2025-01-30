package edu.iutcs.cr.vehicles;

import java.util.Objects;
import java.util.Scanner;

public interface IVehicle {

    public String getRegistrationNumber();
    public void setRegistrationNumber();
    public String getMake();
    public void setMake();
    public String getModel();
    public void setModel();
    public String getYear();
    public void setYear();
    public double getPrice();
    public void setPrice();
    public boolean isAvailable();
    public void setUnavailable();
    public void printVehicleAvailability();

    @Override
    public String toString();
    @Override
    public boolean equals(Object o);
    @Override
    public int hashCode();
}
