package edu.iutcs.cr.persons;

import java.io.Serializable;

public class NullBuyer implements Serializable {

    public NullBuyer() {
        super();
    }

    public void availabilityPrint(){
        System.out.println("Buyer not found. Try again!");
    }


}
