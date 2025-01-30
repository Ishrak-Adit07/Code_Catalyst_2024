package edu.iutcs.cr.system;

import edu.iutcs.cr.Invoice;
import edu.iutcs.cr.persons.Buyer;
import edu.iutcs.cr.persons.Seller;
import edu.iutcs.cr.vehicles.Vehicle;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Raian Rahman
 * @since 4/19/2024
 */

//Bridge Pattern
public class DataStore {

    SaveOperation saveOps;
    LoadOperation loadOps;

    public void saveInvoices(Set<Invoice> invoices) {
        saveOps.save(invoices);
    }

    public Set<Invoice> loadInvoices() {
        Set<Invoice> invoices = loadOps.load();
        return invoices;
    }

    public void saveBuyers(Set<Buyer> buyers) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("buyers.txt"))) {
            outputStream.writeObject(buyers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Set<Buyer> loadBuyers() {
        Set<Buyer> buyers = new HashSet<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("buyers.txt"))) {
            buyers = (Set<Buyer>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            saveBuyers(buyers);
        }
        return buyers;
    }

    public void saveSellers(Set<Seller> sellers) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("sellers.txt"))) {
            outputStream.writeObject(sellers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Set<Seller> loadSellers() {
        Set<Seller> sellers = new HashSet<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("sellers.txt"))) {
            sellers = (Set<Seller>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            saveSellers(sellers);
        }
        return sellers;
    }

    public void saveVehicles(Set<Vehicle> vehicles) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("cars.txt"))) {
            outputStream.writeObject(vehicles);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Set<Vehicle> loadVehicles() {
        Set<Vehicle> vehicles = new HashSet<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("cars.txt"))) {
            vehicles = (Set<Vehicle>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            saveVehicles(vehicles);
        }
        return vehicles;
    }
}
