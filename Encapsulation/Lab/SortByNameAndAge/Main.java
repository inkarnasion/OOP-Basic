package encapsulation.sortByNameAndAge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int num = Integer.parseInt(reader.readLine());
        ArrayList<Person> persons = new ArrayList<>();

        int i = 0;
        while (i < num) {
            String[] input = reader.readLine().split("\\s+");
            persons.add(new Person(input[0], input[1], Integer.valueOf(input[2])));
            i++;
        }

        persons.sort(Comparator.comparing(Person::getFirstName).thenComparingInt(Person::getAge));

        persons.stream().map(Person::toString).forEach(System.out::println);
    }
}