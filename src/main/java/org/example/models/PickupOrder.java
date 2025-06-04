package org.example.models;

public class PickupOrder extends Order {
    private String pickupLocation;

    public PickupOrder(Customer customer, double price, String pickupLocation){
        super(customer, price);
        this.pickupLocation = pickupLocation;
    }

    public String getPickupLocation(){

        return pickupLocation;
    }

    public  void setPickupLocation(String pickupLocation){

        this.pickupLocation = pickupLocation;
    }
    @Override
    public void printSummary() {
    super.printSummary();
    System.out.println("Pickup Location: " + pickupLocation);
    }

}
