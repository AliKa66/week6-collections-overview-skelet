package be.pxl.collections.priorityqueue;

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

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

	@Override
	public String toString() {
		return "Customer [name=" + name + ", points=" + points + ", customerNumber=" + customerNumber + "]";
	}
    
    
}
