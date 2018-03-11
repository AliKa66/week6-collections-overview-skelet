package be.pxl.collections.linkedhashset;

public class Customer {
    private String name;
    private int points;
    private int customerNumber;

    public Customer(int customerNumber, String name) {
        this.name = name;
        this.customerNumber = customerNumber;
        points = 0;
    }

    public int addPoints(int pointsToAdd) {
        points += pointsToAdd;
        return points;
    }

    public int getPoints() {
        return points;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return getCustomerNumber() == customer.getCustomerNumber();
    }

    @Override
    public int hashCode() {
        return getCustomerNumber();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("CustomerNumber: ").append(customerNumber).append(" Naam: ").append(name);
        return result.toString();
    }
}
