package Assignment;

import java.util.*;
import java.util.Objects;
import java.util.stream.Collectors;

public class Employee implements Comparable {
    private String name;
    private int age;
    private double salary;
    private String department;

    public Employee(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> employees;
        employees = Arrays.asList(
                new Employee("John Doe", 35, 75000, "IT"),
                new Employee("Jane TSmith", 32, 80000, "Finance"),
                new Employee("Jane TSmith", 32, 80000, "Finance"),
                new Employee("Mark Doe", 28, 55000, "IT"),
                new Employee("Sarah Connor", 40, 100000, "HR"),
                new Employee("Sarah Connor", 40, 100000, "HR"),
                new Employee("Steve Rogers", 25, 45000, "Marketing"),
                new Employee("John Doe", 35, 75000, "IT"),
                new Employee("Tony Stark", 45, 120000, "Finance"));

        System.out.println("-----------------------");

        Map<String, List<Employee>> byDept = employees.stream()
                .map(e-> { e.setName(e.getName().toUpperCase()); return e; })
                .distinct()
                .sorted()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(byDept);
    }

    @Override
    public int compareTo(Object o) {
        String s1 = this.getName().split(" ")[1];
        String s2 = ((Employee)o).getName().split(" ")[1];
        return s1.compareTo(s2);
    }
}