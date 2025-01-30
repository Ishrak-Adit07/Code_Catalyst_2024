package edu.iutcs.cr;

import edu.iutcs.cr.persons.Buyer;
import edu.iutcs.cr.persons.Seller;
import edu.iutcs.cr.vehicles.Vehicle;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * @author Raian Rahman
 * @since 4/19/2024
 */
public class Invoice implements Serializable {

    private final Buyer buyer;
    private final Seller seller;
    private final ShoppingCart shoppingCart;
    private boolean isPaid;
    private final LocalDateTime dateTime;

    public Invoice(Buyer buyer, Seller seller, ShoppingCart shoppingCart) {
        this.buyer = buyer;
        this.seller = seller;
        this.shoppingCart = shoppingCart;
        takePayment();
        markCarAsUnavailable();
        dateTime = LocalDateTime.now();
    }

    public void printInvoice() {
        System.out.println("Buyer: " + this.buyer.toString());
        System.out.println("Seller: " + this.seller.toString());
        System.out.println("Payment Status: " + (isPaid ? "Paid" : "Due"));
        System.out.println("Date: " + dateTime.toLocalDate() + " Time: " + dateTime.toLocalTime());

        this.shoppingCart.viewCart();
    }

    public void takePayment() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Is payment done (true/false): ");
        this.isPaid = scanner.nextBoolean();
    }

    private void markCarAsUnavailable() {
        for(Vehicle vehicle: shoppingCart.getVehicles()) {
            vehicle.setUnavailable();
        }
    }
}
