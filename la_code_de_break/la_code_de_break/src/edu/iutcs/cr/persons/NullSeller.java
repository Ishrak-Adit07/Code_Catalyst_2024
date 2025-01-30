package edu.iutcs.cr.persons;

import java.io.Serializable;

/**
 * @author Raian Rahman
 * @since 4/18/2024
 */
public class NullSeller extends Person implements Serializable {

    public NullSeller() {
        super();
    }

    public void availabilityPrint(){
        System.out.println("Seller not found. Try again!");
    }
}
