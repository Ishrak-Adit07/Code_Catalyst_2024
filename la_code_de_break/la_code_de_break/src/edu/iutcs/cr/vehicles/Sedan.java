package edu.iutcs.cr.vehicles;

import java.io.Serializable;
import java.util.Scanner;

/**
 * @author Raian Rahman
 * @since 4/19/2024
 */
public class Sedan extends Vehicle implements Serializable {

    private boolean hasSunroof;

    // Constructor
    public Sedan() {
        super();
        setHasSunroof();
    }

    // Getters and setters
    public boolean hasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof() {
        // Taking input within the setter, which might lead to unexpected behavior
        Scanner scanner = new Scanner(System.in);
        System.out.print("Does the sedan have a sunroof? (true/false): ");
        this.hasSunroof = scanner.nextBoolean();
    }

    @Override
    public String toString() {
        return "Sedan{" + super.toString() + ", " +
                "hasSunroof=" + hasSunroof() +
                "}";
    }
}
