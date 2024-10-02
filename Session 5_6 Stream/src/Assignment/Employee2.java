package Assignment;

import java.util.*;
import java.util.stream.Collectors;

public class Employee2 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 35, 120000, "IT"),
                new Employee("Jane", 28, 130000, "HR"),
                new Employee("Mark", 40, 140000, "IT"),
                new Employee("Alice", 32, 150000, "IT"),
                new Employee("Bob", 38, 160000, "HR"),
                new Employee("Tom", 50, 170000, "Finance"),
                new Employee("Jerry", 39, 100000, "IT"),
                new Employee("Kim", 45, 200000, "HR"),
                new Employee("Sam", 36, 110000, "Finance"),
                new Employee("Nina", 33, 125000, "IT"),
                new Employee("Zack", 48, 180000, "IT"));

//        Map<String, List<Employee>> byDept1 = employees.stream()
//                .filter(e -> e.getAge() > 30)
//                .sorted((e1, e2) -> {
//                    return (int) (e2.getSalary() - e1.getSalary());
//                })
//                .limit(5)
//                .collect(Collectors.groupingBy(Employee::getDepartment));

        Map<String, List<Employee>> byDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
// How to limit by department
        System.out.println(byDept);

        Set<Map.Entry<String, List<Employee>>> s = byDept.entrySet();

        for(Map.Entry a : s){
            List<Employee> l =  (List<Employee>)a.getValue();
            List<Employee> l2 =   l.stream().filter(e -> e.getAge() > 30)
                       .sorted((e1, e2) -> {
                            return (int) (e2.getSalary() - e1.getSalary());
                        })
                       .limit(5)
                       .collect(Collectors.toList());

            a.setValue(l2);
        }

        System.out.println(byDept);
    }
}
