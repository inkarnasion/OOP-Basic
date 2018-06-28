package interfacesAndAbstraction_exercises.telephony_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] phoneNumbers = reader.readLine().split("\\s+");
        String[] urls = reader.readLine().split("\\s+");

        Smartphone smartphone = new Smartphone();

        for (String phoneNumber : phoneNumbers) {
            try {
                System.out.println(smartphone.call(phoneNumber));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }

        for (String url : urls) {
            try {
                System.out.println(smartphone.browse(url));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
