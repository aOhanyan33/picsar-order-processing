package org.example;

import org.example.models.Customer;
import org.example.models.ExpressOrder;
import org.example.models.InternationalOrder;
import org.example.models.Order;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Alice", "Smith", "+37412345678", "Yerevan, Armenia");
        Customer customer2 = new Customer("Anna", "Smith", "+37412345678", "Paris, France");
        Customer customer3 = new Customer("Ara", "Smith", "+37412345678", "Paris, France");

        ExpressOrder ex_order1 = new ExpressOrder(customer1, 2000);
        ExpressOrder ex_order2 = new ExpressOrder(customer2, 3000);

        InternationalOrder inter_order3 = new InternationalOrder(customer3, 4000);
        //order3.printSummary();

        Order[] orders = new Order[5]; //int[] numbers = new int[5];

        orders[0] = ex_order1;
        orders[1] = ex_order2;
        orders[2] = inter_order3;

//        Order order = new ExpressOrder(Customer)
//        order.getCustomer().printSummary();
//        order

        for (Order order : orders){
            if (order != null){
                order.printSummary();}}

//        for (Order order : orders){
//            if (order instanceof ExpressOrder){
//                    order.printSummary();}
//

//        }
        }
    }
