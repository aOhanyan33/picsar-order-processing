package org.example.models;

import org.example.exceptions.DeliveryException;

public class InternationalOrder extends Order implements Deliverable{
    public InternationalOrder (Customer customer, double price){
        super(customer, price);
    }

    private static String vendor = "FedEx";

    @Override
    public double calculateDeliveryPrice(){
        return price * 0.2;
    }

    @Override
    public void printSummary(){
        super.printSummary();
        System.out.println("Type: International Order, Delivery Price $ " + calculateDeliveryPrice());
    }

    @Override
    public String getOrderType() {
        return "International Order";
    }

    //checking country
    public boolean isCountryGeorgia() {
        if (customer.getAddress().getCountry().equals("Georgia")) {
            throw new DeliveryException("We don't deliver to Georgia");
        } else {
            return false;
        }
    }
}
