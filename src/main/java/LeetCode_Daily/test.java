package LeetCode_Daily;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", 17),
                new Person("Alice", 20),
                new Person("Bob", 30),
                new Person("Eve", 16)
        );

        people.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .ifPresent(oldest -> System.out.println(oldest.getName()));

    }
}
