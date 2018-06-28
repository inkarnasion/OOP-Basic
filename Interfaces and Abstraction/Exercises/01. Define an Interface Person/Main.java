package interfacesAndAbstraction_exercises.defineАnInterfacePerson_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Class[] citizenInterfaces=Citizen.class.getInterfaces();

        if (Arrays.asList(citizenInterfaces).contains(Person.class)){

            Method[]fields = Person.class.getDeclaredMethods();

            String name = reader.readLine();
            int age = Integer.parseInt(reader.readLine());

            Person person = new Citizen(name,age);
            System.out.println(fields.length);
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }
    }
}
