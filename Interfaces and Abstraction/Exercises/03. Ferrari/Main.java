package interfacesAndAbstraction_exercises.ferrari_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.instrument.IllegalClassFormatException;

public class Main {
    public static void main(String[] args) throws IllegalClassFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Car ferrari = new Ferrari(reader.readLine());
        System.out.println(ferrari);


        boolean isCreated = Car.class.isInterface();

        if (!isCreated) {
            throw new IllegalClassFormatException("No interface created!");
        }

    }
}