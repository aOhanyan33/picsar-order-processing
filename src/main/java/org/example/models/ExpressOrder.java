package org.example.models;

public class ExpressOrder extends Order implements Deliverable {

    public ExpressOrder (Customer customer, double price){

        super(customer, price);
    }
    private static String vendor = "DHL";

    @Override
    public double calculateDeliveryPrice(){
        return price * 0.1;
    }

    @Override
    public void printSummary(){
        super.printSummary();
        System.out.println("Type: Express Order, Delivery Price AMD " + calculateDeliveryPrice());
    }

    @Override
    public String getOrderType() {
        return "Express Order";
    }
    public static String getVendor(){
        return vendor;
    }
    public static void setVendor(String vendor){
        
    }
}
