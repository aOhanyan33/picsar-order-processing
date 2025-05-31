package org.example.models;

public class InternationalOrder extends Order implements Deliverable{
    public InternationalOrder (Customer customer, double price){
        super(customer, price);
    }

    @Override
    public double calculateDeliveryPrice(){
        return price * 0.2;
    }

    @Override
    public void printSummary(){
        super.printSummary();
        System.out.println("Type: International Order, Delivery Price $ " + calculateDeliveryPrice());
    }
}
