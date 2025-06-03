package org.example;

import org.example.models.Customer;
import org.example.models.ExpressOrder;
import org.example.models.InternationalOrder;
import org.example.models.Order;
import org.example.models.Address;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("123 Main St", "Tbilisi", "Georgia");
        Address address2 = new Address("123 Main St", "Yerevan", "Armenia");

        Customer customer1 = new Customer("Alice", "Smith", "+37412345678", address1);
        Customer customer2 = new Customer("Anna", "Smith", "+37412345678", address2);
        Customer customer3 = new Customer("Ara", "Smith", "+37412345678", address1);

        ExpressOrder ex_order1 = new ExpressOrder(customer1, 2000);
        ExpressOrder ex_order2 = new ExpressOrder(customer2, 3000);



        InternationalOrder inter_order3 = new InternationalOrder(customer3, 4000);
        //order3.printSummary();

        if (customer1.getAddress().getCity().equalsIgnoreCase("Tbilisi")) {
            System.out.println("Sorry, we do not offer delivery to Tbilisi.");
        } else {
            Order order = new ExpressOrder(customer1, 20000);
            order.printSummary();

        Order[] orders = new Order[5]; //int[] numbers = new int[5];

        orders[0] = ex_order1;
        orders[1] = ex_order2;
        orders[2] = inter_order3;

//        Order order = new ExpressOrder(Customer);
//        order.getCustomer().printSummary();
//

        for (Order order : orders){
            if (order != null){
                order.getCustomer().printSummary();
                order.printSummary();
            }}

        int expressOrderCount = 0;
        int interOrderCount = 0;
        for (Order order : orders){
            if (order instanceof ExpressOrder){
                    expressOrderCount++;
                    break;
            } else if (order instanceof InternationalOrder);
                    interOrderCount ++;

        }}

        //System.out.println("Total express orders" + expressOrderCount);
    }}
