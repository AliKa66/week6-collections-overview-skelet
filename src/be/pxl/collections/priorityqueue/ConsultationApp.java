package be.pxl.collections.priorityqueue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ConsultationApp {

    public static void main(String[] args) {
        Customer alice = new Customer(101, "Alice");
        alice.addPoints(22);

        Customer peter = new Customer(102, "Peter");
        peter.addPoints(15);

        Customer sofie = new Customer(105, "Sofie");
        sofie.addPoints(33);

        Customer bea = new Customer(108, "Bea");
        bea.addPoints(12);

        PriorityQueue<Customer> myCustomers = new PriorityQueue<>((c1, c2)  -> c1.getPoints() - c2.getPoints());
        myCustomers.addAll(Arrays.asList(peter, sofie, bea, alice));
        
        while (myCustomers.peek() != null) {
        	System.out.println(myCustomers.poll());
        }

    }
}
