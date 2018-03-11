package be.pxl.collections.linkedhashset;

import java.util.LinkedHashSet;

public class LoyaltyApp {

    public static void main(String[] args) {
        LinkedHashSet<Customer> myCustomers = new LinkedHashSet<>();

        myCustomers.add(new Customer(101, "Alice"));
        myCustomers.add(new Customer(103, "Peter"));
        myCustomers.add(new Customer(105, "Tim"));
        myCustomers.add(new Customer(108, "Bea"));
        myCustomers.add(new Customer(105, "Sam"));
        myCustomers.add(new Customer(102, "Vera"));

        System.out.println("Number of customers: " + myCustomers.size());

        for (Customer customer : myCustomers) {
            System.out.println(customer);
        }

       findCustomerByCustomerNumber(105, myCustomers).addPoints(15);

        // lambda expressie om totaal gespaarde punten te tonen
        System.out.println(myCustomers.stream().mapToInt(cust -> cust.getPoints()).sum());

    }

    private static Customer findCustomerByCustomerNumber(int customerNumber, LinkedHashSet<Customer> customers) {
        for (Customer customer : customers) {
            if (customer.getCustomerNumber() == customerNumber) {
                return customer;
            }
        }
        return null;
    }
}
