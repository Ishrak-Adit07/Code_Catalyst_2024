package edu.iutcs.cr.vehicles;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author Raian Rahman
 * @since 4/18/2024
 */

//Factory Pattern

public class Vehicle implements IVehicle,Serializable {

    // make, model, year -> Parameter Object
    // price, available, registrationNumber -> Parameter Object

    private String make;
    private String model;
    private String year;
    private double price;
    private boolean available;
    private String registrationNumber;

    public Vehicle() {
        setRegistrationNumber();
        setMake();
        setModel();
        setYear();
        setPrice();
        this.available = true;
    }

    public Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public void setRegistrationNumber() {
        Scanner scanner = new Scanner(System.in);
        while (this.registrationNumber == null || registrationNumber.isBlank()) {
            System.out.print("Enter registration number: ");
            this.registrationNumber = scanner.nextLine();

            if (registrationNumber == null || registrationNumber.isBlank()) {
                System.out.println("Registration number is mandatory!");
            }
        }
    }

    public String getMake() {
        return make;
    }

    public void setMake() {
        Scanner scanner = new Scanner(System.in);

        while (this.make == null || this.make.isBlank()) {
            System.out.print("Enter make: ");
            this.make = scanner.nextLine();

            if (make == null || make.isBlank()) {
                System.out.println("Make is mandatory!");
            }
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel() {
        Scanner scanner = new Scanner(System.in);

        while (this.model == null || this.model.isBlank()) {
            System.out.print("Enter model: ");
            this.model = scanner.nextLine();

            if (model == null || model.isBlank()) {
                System.out.println("Model is mandatory!");
            }
        }
    }

    public String getYear() {
        return year;
    }

    public void setYear() {
        Scanner scanner = new Scanner(System.in);

        while (this.year == null || this.year.isBlank()) {
            System.out.print("Enter year: ");
            this.year = scanner.nextLine();

            if (year == null || year.isBlank()) {
                System.out.println("Year is mandatory!");
            }
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter price: ");
        this.price = scanner.nextDouble();
    }

    public boolean isAvailable() {
        return available;
    }

    public void setUnavailable() {
        this.available = false;
    }

    public void printVehicleAvailability(){
        if(this.isAvailable()){
            System.out.println("Vehicle available");
        }
        else{
            System.out.println("Vehicle not available");
        }
    }

    @Override
    public String toString() {
        return "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", price=" + price +
                ", available=" + available +
                ", registrationNumber='" + registrationNumber + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle vehicle)) return false;
        return Objects.equals(this.registrationNumber, vehicle.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNumber);
    }

    //Pulling up to_string method for subclass
    public String subClassToStringInt(String paramName, int param){
        return toString() + ", " + paramName + "=" + param + "}";
    }

    public String subClassToStringBool(String paramName, Boolean param){
        return toString() + ", " + paramName + "=" + param + "}";
    }

}
