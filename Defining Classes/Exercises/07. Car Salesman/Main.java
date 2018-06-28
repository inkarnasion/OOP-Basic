package definingClasses_exercises.CarSalesman_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int counts = Integer.parseInt(reader.readLine());
        Map<String, Engine> engines = new LinkedHashMap<>();
        List<Car> cars = new ArrayList<>();

        while (true) {
            if (counts-- <= 0) break;
            String[] tokens = reader.readLine().split("\\s+");

            Engine engine = null;

            if (tokens.length == 2) {
                engine = new Engine(tokens[0], Integer.parseInt(tokens[1]));

            } else if (tokens.length == 3) {
                engine = tokens[2].matches("\\d+") ? new Engine(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])) : new Engine(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);

            } else if (tokens.length == 4) {
                engine = new Engine(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), (tokens[3]));

            }

            engines.putIfAbsent(tokens[0], engine);
        }

        int countOfCars = Integer.parseInt(reader.readLine());

        while (true) {
            if (countOfCars-- <= 0) break;
            String[] tokens = reader.readLine().split("\\s+");

            Car car = null;

            if (tokens.length == 2) {
                car = new Car(tokens[0], engines.get(tokens[1]));

            } else if (tokens.length == 3) {
                car = tokens[2].matches("\\d+") ? new Car(tokens[0], engines.get(tokens[1]), Integer.parseInt(tokens[2])) : new Car(tokens[0], engines.get(tokens[1]), tokens[2]);

            } else if (tokens.length == 4) {
                car = new Car(tokens[0], engines.get(tokens[1]), Integer.parseInt(tokens[2]), (tokens[3]));

            }

            cars.add(car);
        }

        cars.forEach(System.out::println);
    }
}