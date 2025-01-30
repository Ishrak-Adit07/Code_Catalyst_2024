package edu.iutcs.cr.persons;

import java.io.Serializable;

/**
 * @author Raian Rahman
 * @since 4/18/2024
 */
public class Seller extends Person implements Serializable {

    public Seller() {
        super();
    }

    public Seller(String id) {
        super(id);
    }

    public void availabilityPrint(){

    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
