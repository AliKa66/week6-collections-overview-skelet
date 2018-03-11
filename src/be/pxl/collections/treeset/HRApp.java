package be.pxl.collections.treeset;

import java.util.TreeSet;

public class HRApp {
    public static void main(String[] args) {
        TreeSet<Employee> ourEmployees = new TreeSet<>((e1, e2) -> e1.getSalary() - e2.getSalary());

        ourEmployees.add(new Employee("Tom", 80000));
        ourEmployees.add(new Employee("Jack", 35000));
        ourEmployees.add(new Employee("Jim", 62500));
        ourEmployees.add(new Employee("Peter", 58200));
        ourEmployees.add(new Employee("Mary", 77000));
        ourEmployees.add(new Employee("Jane", 69500));
        ourEmployees.add(new Employee("David", 54000));
        ourEmployees.add(new Employee("Sam", 82000));

        ourEmployees.stream().forEach(System.out::println);

        System.out.println("Employee with salary > 70000");
        System.out.println(ourEmployees.higher(new Employee("Dummy", 70000)));
        
        System.out.println("Employee with salary < 70000");
        System.out.println(ourEmployees.lower(new Employee("Dummy", 70000)));
        
        System.out.println("Employee with lowest salary");
        System.out.println(ourEmployees.first());

    }
}
