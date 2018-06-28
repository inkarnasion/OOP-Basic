package encapsulation.salaryIncrease;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main
    (String[]args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        ArrayList<Person> persons = new ArrayList<>();

        int i = 0;
        while (i < number) {
            String[] personParameters = reader.readLine().split(" ");
            persons.add(new Person(personParameters[0], personParameters[1],
                    Integer.valueOf(personParameters[2]), Double.valueOf(personParameters[3])));
            i++;
        }

        int bonus = Integer.parseInt(reader.readLine());
        persons.forEach(person -> {
            person.increaseSalary(bonus);
            System.out.println(person);
        });
    }
}