package edu.iutcs.cr.vehicles;

import java.util.Scanner;

/**
 * @author Raian Rahman
 * @since 4/19/2024
 */
public class Hatchback extends Vehicle {

    private boolean isCompact;

    public Hatchback() {
        super();
        setCompact();
    }

    public boolean isCompact() {
        return isCompact;
    }

    public void setCompact() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Is the hatchback compact? (true/false): ");
        this.isCompact = scanner.nextBoolean();
    }

    @Override
    public String toString() {
        return "Hatchback{" + super.toString() + ", " +
                "isCompact=" + isCompact() +
                "}";
    }
}
