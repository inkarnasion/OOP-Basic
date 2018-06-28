package definingClasses_exercises.RawData_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(reader.readLine());

        List<Car> cars = new ArrayList<>();

        while (n-- > 0) {
            String[] carData = reader.readLine().split("\\s+");

            Car car;

            String model = carData[0];
            int engineSpeed = Integer.parseInt(carData[1]);
            int enginePower = Integer.parseInt(carData[2]);

            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(carData[3]);
            String cargoType = carData[4];

            Cargo cargo = new Cargo(cargoType, cargoWeight);

            List<Tire> tires = new ArrayList<>();


            IntStream.iterate(5, i -> i < carData.length - 1, i -> i + 2).forEachOrdered(i -> {
                double pressure = Double.parseDouble(carData[i]);
                int age = Integer.parseInt(carData[i + 1]);
                Tire tire = new Tire(age, pressure);
                tires.add(tire);
            });

            car = new Car(model, engine, cargo, tires);
            cars.add(car);
        }

        String command = reader.readLine();
        if ("fragile".equals(command)) {
            for (Car car : cars) {
                if (car.getTires().stream()
                        .filter(tire -> tire.getPressure() < 1)
                        .collect(Collectors.toList()).size() > 0) {
                    if (car.getCargo().getType().equals("fragile")) {
                        System.out.println(car);
                    }
                }
            }


        } else if ("flamable".equals(command)) {
            for (Car car : cars) {
                if ("flamable".equals(car.getCargo().getType())) {
                    if (car.getEngine().getPower() > 250) {
                        System.out.println(car);
                    }
                }
            }

        }
    }
}