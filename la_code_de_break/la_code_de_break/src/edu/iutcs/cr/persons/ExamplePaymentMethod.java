package edu.iutcs.cr.persons;

public class ExamplePaymentMethod implements PaymentMethod{
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public void pay(){
        System.out.println("Example pay");
    }
}
