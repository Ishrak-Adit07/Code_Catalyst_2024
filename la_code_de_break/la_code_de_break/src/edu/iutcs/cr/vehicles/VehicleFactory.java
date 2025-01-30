package edu.iutcs.cr.vehicles;

public class VehicleFactory {

    Vehicle vehicle;

    public VehicleFactory(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public Vehicle makeVehicle(int vehicleType){
        if (vehicleType == 1) {
            System.out.println("\n\nCreate new bus");
            vehicle = new Bus();
        } else if (vehicleType == 2) {
            System.out.println("\n\nCreate new car");
            vehicle = new Car();
        } else if (vehicleType == 3) {
            System.out.println("\n\nCreate new hatchback");
            vehicle = new Hatchback();
        } else if (vehicleType == 4) {
            System.out.println("\n\nCreate new sedan");
            vehicle = new Sedan();
        } else {
            System.out.println("\n\nCreate new SUV");
            vehicle = new SUV();
        }

        return vehicle;
    }
}
