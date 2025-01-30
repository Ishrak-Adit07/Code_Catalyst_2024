package edu.iutcs.cr.vehicles;

import java.io.Serializable;
import java.util.Scanner;

/**
 * @author Raian Rahman
 * @since 4/19/2024
 */
public class SUV extends Vehicle implements Serializable {

    private boolean isOffRoad;

    // Constructor
    public SUV() {
        super();
        setOffRoad();
    }

    // Getters and setters
    public boolean isOffRoad() {
        return isOffRoad;
    }

    public void setOffRoad() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Is the SUV for off-road use? (true/false): ");
        this.isOffRoad = scanner.nextBoolean();
    }

    @Override
    public String toString() {
        return "SUV{" + super.toString() + ", " +
                "isOffRoad=" + isOffRoad() +
                "}";
    }
}
