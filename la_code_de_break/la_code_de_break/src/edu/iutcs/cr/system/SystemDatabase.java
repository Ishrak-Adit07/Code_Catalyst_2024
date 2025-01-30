package edu.iutcs.cr.system;

import edu.iutcs.cr.Invoice;
import edu.iutcs.cr.persons.Buyer;
import edu.iutcs.cr.persons.Seller;
import edu.iutcs.cr.vehicles.Vehicle;

import java.io.Serializable;
import java.util.Set;

import static java.util.Objects.isNull;

/**
 * @author Raian Rahman
 * @since 4/19/2024
 */

//Composite Pattern

public class SystemDatabase implements Serializable {

    private Set<Buyer> buyers;
    private Set<Seller> sellers;
    private Set<Vehicle> vehicles;
    private Set<Invoice> invoices;

    protected static SystemDatabase instance;

    public SystemDatabase() {
        DataStore dataStore = new DataStore();

        buyers = dataStore.loadBuyers();
        sellers = dataStore.loadSellers();
        vehicles = dataStore.loadVehicles();
        invoices = dataStore.loadInvoices();
    }

    public static SystemDatabase getInstance() {
        if (isNull(instance)) {
            instance = new SystemDatabase();
        }

        return instance;
    }

    public void saveSystem() {
        DataStore dataStore = new DataStore();

        dataStore.saveBuyers(buyers);
        dataStore.saveSellers(sellers);
        dataStore.saveVehicles(vehicles);
        dataStore.saveInvoices(invoices);
    }

    public Set<Buyer> getBuyers() {
        return buyers;
    }

    public Set<Seller> getSellers() {
        return sellers;
    }

    public Set<Vehicle> getVehicles() {
        return vehicles;
    }

    public Set<Invoice> getInvoices() {
        return invoices;
    }

    public void showInventory() {
        System.out.println("\n\n\nInventory list");
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles is present in system");
            return;
        }

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }

    public void showBuyerList() {
        System.out.println("\n\n\nCustomer's list");
        if (buyers.isEmpty()) {
            System.out.println("No buyer is present in system");
            return;
        }

        for (Buyer buyer : buyers) {
            System.out.println(buyer.toString());
        }
    }

    public void showSellerList() {
        System.out.println("\n\n\nSeller's list");
        if (sellers.isEmpty()) {
            System.out.println("No seller is present in system");
            return;
        }

        for (Seller seller : sellers) {
            System.out.println(seller.toString());
        }
    }

    public void showInvoices() {
        System.out.println("\n\n\nInvoice list");
        if(invoices.isEmpty()) {
            System.out.println("No invoice found in system");
            return;
        }

        for(Invoice invoice: invoices) {
            invoice.printInvoice();
            System.out.println("\n\n\n");
        }
    }

    public Vehicle findVehicleByRegistrationNumber(String registrationNumber) {
        Vehicle newVehicle = new Vehicle(registrationNumber);

        for (Vehicle vehicle : vehicles) {
            if (vehicle.equals(newVehicle)) {
                return vehicle;
            }
        }

        return null;
    }

    public Buyer findBuyerById(String id) {
        Buyer newBuyer = new Buyer(id);

        for (Buyer buyer : buyers) {
            if (buyer.equals(newBuyer)) {
                return buyer;
            }
        }

        return null;
    }

    public Seller findSellerById(String id) {
        Seller newSeller = new Seller(id);

        for (Seller seller : sellers) {
            if (seller.equals(newSeller)) {
                return seller;
            }
        }

        return null;
    }

    public void addNewSeller(Seller newSeller){
        System.out.println("\n\n\nAdd new seller");
        sellers.add((newSeller));
    }

    public void addNewBuyer(Buyer newBuyer){
        System.out.println("\n\n\nAdd new customer");
        buyers.add((newBuyer));
    }

    public void addNewVehicle(Vehicle newVehicle){
        vehicles.add(newVehicle);
    }
}
