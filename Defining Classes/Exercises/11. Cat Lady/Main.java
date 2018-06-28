package definingClasses_exercises.catLady_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Cat> cats = new HashMap<>();

        while (true) {
            String input = reader.readLine();
            if ("End".equals(input)) break;

            String[] params = input.split("\\s+");
            String breed = params[0];
            String name = params[1];
            double special = Double.parseDouble(params[2]);

            Cat cat = null;
            switch (breed) {
                case "Siamese":
                    // пример за полиморфизъм
                    cat = new Siamese(name, special);
                    break;
                case "Cymric":
                    cat = new Cymric(name, special);
                    break;
                case "StreetExtraordinaire":
                    cat = new StreetExtraordinaire(name, special);
                    break;
            }
            cats.put(name, cat);
        }

        String searched = reader.readLine();

        System.out.println(cats.get(searched));
    }
}