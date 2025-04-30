package LeetCode_Daily;

import java.util.Comparator;
import java.util.List;

public class test {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", 17),
                new Person("Alice", 20),
                new Person("Bob", 30),
                new Person("Eve", 16),
                new Person("Bob", 20),
                new Person("Bob", 10),
                new Person("Bob", 40)

                );


        System.out.println(people.stream()
                .filter(p -> p.getName().equals("Bob"))
                .mapToInt(person -> person.getAge())
                .sum());


        Person persona;

        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getAge() == 30) {
                persona = people.get(i);
            }
        }


    }

}
