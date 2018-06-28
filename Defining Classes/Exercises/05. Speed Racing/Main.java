package definingClasses_exercises.SpeedRacing_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Car> cars = new LinkedHashMap<>();

        int count = Integer.parseInt(reader.readLine());

        while (count-- > 0) {
            String[] input = reader.readLine().split("\\s+");

            String model = input[0];
            double fuel = Double.parseDouble(input[1]);
            double costPerKilometers = Double.parseDouble(input[2]);

            Car car = new Car(model, fuel, costPerKilometers);
            cars.put(model, car);
        }
        String line;
        while (!"End".equals(line = reader.readLine())) {
            String[] carType = line.split("\\s+");

            try {
                String carModel = carType[1];
                int kilometers = Integer.parseInt(carType[2]);
                cars.get(carModel).drive(kilometers);

            } catch (IllegalStateException ex) {
                System.out.println(ex.getMessage());
            }

        }
        cars.values().forEach(System.out::println);
    }
}
