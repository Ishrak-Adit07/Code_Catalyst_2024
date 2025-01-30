package edu.iutcs.cr.system;

import edu.iutcs.cr.Invoice;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class LoadOperation {

    SaveOperation saveOp;

    LoadOperation(){
        saveOp = new SaveOperation();
    }

    public Set<Invoice> load(){
        Set<Invoice> invoices = new HashSet<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("invoices.txt"))) {
            invoices = (Set<Invoice>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            saveOp.save(invoices);
        }
        return invoices;
    }

}
