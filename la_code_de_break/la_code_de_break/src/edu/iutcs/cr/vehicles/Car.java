package edu.iutcs.cr.vehicles;

import java.io.Serializable;
import java.util.Scanner;

/**
 * @author Raian Rahman
 * @since 4/18/2024
 */
public class Car extends Vehicle implements Serializable {

    int seatingCapacity;

    public Car() {
        super();
        setSeatingCapacity();
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new seating capacity: ");
        this.seatingCapacity = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() + ", " +
                "seatingCapacity=" + getSeatingCapacity() +
                "}";
    }
}
