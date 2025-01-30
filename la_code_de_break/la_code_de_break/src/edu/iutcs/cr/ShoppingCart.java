package edu.iutcs.cr;

import edu.iutcs.cr.system.SystemDatabase;
import edu.iutcs.cr.vehicles.NullVehicle;
import edu.iutcs.cr.vehicles.Vehicle;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static java.util.Objects.isNull;

//Mediator Pattern*********

/**
 * @author Raian Rahman
 * @since 4/19/2024
 */
public class ShoppingCart implements Serializable {

    private final Set<Vehicle> vehicles;
    private final SystemDatabase database;

    public ShoppingCart() {
        this.vehicles = new HashSet<>();
        database = SystemDatabase.getInstance();
    }

    public Set<Vehicle> getVehicles() {
        return this.vehicles;
    }

    public void addItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter registration number of vehicle: ");
        String registrationNumber = scanner.next();

        Vehicle vehicle = (database.findVehicleByRegistrationNumber(registrationNumber)==null)? new NullVehicle() : database.findVehicleByRegistrationNumber(registrationNumber);

//        if (isNull(vehicle) || !vehicle.isAvailable()) {
//            System.out.println("Vehicle not available");
//            return;
//        }

        vehicle.printVehicleAvailability();

        vehicles.add(vehicle);
    }

    public void removeItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the registration number of the vehicle: ");
        String registrationNumber = scanner.nextLine();
        vehicles.remove(new Vehicle(registrationNumber));
    }

    public void viewCart() {
        System.out.println("\n\nShopping cart\n\n");

        if(vehicles.isEmpty()) {
            System.out.println("Cart is empty");
            return;
        }

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }
}
