package org.example.models;

import org.example.exceptions.PaymentException;

public abstract class Order implements Comparable<Order>{

    protected Customer customer;
    protected double price;

    public Order(Customer customer){
        this.customer = customer;
        this.price = 0;
    }

    public Order(Customer customer, double price){
        this.customer = customer;
        this.price = price;
    }

    public void printSummary(){

        //System.out.println( "Customer: " + customer.getFullName() + "  " + "Price: AMD " + price);
        System.out.println( "Order: " + "  " + "Price: AMD " + price);
    }

    public double getPrice(){

        return price;
    }
    public void setPrice(double price){
        this.price = price;

    }
    public Customer getCustomer(){

        return customer;
    }

    public void setCustomer(Customer customer){

        this.customer = customer;
    }

    public void shipment(){
        if (price <= 0) {
            throw new PaymentException("Please make a payment");
        }
        System.out.println("Shipment started");
    }

    @Override
    public String toString() {
        return  customer + " " + price;
    }

    @Override
    public int compareTo(Order o){
        if (this.price > o.price) {
            return -1;
        } else if (this.price > o.price) {
            return 1;
        } else {
            return 0;


        }
    }


    public abstract String getOrderType();

}
