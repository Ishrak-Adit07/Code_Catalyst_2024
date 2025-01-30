package edu.iutcs.cr.system;

import edu.iutcs.cr.Invoice;
import edu.iutcs.cr.persons.Buyer;
import edu.iutcs.cr.persons.Seller;
import edu.iutcs.cr.vehicles.Vehicle;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Set;

public class SaveOperation {

    SaveOperation(){
    }

    public void save(Set<Invoice> invoices){
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("invoices.txt"))) {
            outputStream.writeObject(invoices);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
