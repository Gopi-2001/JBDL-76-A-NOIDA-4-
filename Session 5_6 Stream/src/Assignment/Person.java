package Assignment;

import java.util.*;
import java.util.stream.Collectors;


public class Person {
    private String name;
    private List<String> hobbies;

    public Person(String name, List<String> hobbies) {
        this.name = name;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alok", Arrays.asList("Reading", "Hiking", "Swimming")),
                new Person("Bobby", Arrays.asList("Cycling", "Hiking", "Cooking")),
                new Person("Charlie", Arrays.asList("Reading", "Cooking", "Gaming")),
                new Person("Dheerendra", Arrays.asList("Swimming", "Running", "Cycling")) );

        List<String> ls = people.stream()
                .map(p -> p.getHobbies())
                .flatMap(c -> c.stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(ls);

    }

}


