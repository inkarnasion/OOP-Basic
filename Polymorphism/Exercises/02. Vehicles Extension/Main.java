package polymorphism_exercises.veniclesExtended_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    private static final Map<String, Double> SUMMER_MODE_PERMANENT_ON = new HashMap<>() {{
        put("Car", 0.9);
        put("Truck", 1.6);
        put("Bus", 1.4);
    }};
    private static final String DRIVE_COMMAND = "Drive";
    private static final String DRIVE_EMPTY_BUS_COMMAND = "DriveEmpty";
    private static final String REFUEL_COMMAND = "Refuel";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] carTokens = reader.readLine().split("\\s+");
        String[] truckTokens = reader.readLine().split("\\s+");
        String[] busTokens = reader.readLine().split("\\s+");

        String carType = carTokens[0];
        String truckType = truckTokens[0];
        String busType = busTokens[0];

        Vehicle car = new Car(Double.parseDouble(carTokens[1]), Double.parseDouble(carTokens[2]), Double.parseDouble(carTokens[3]));
        Vehicle truck = new Truck(Double.parseDouble(truckTokens[1]), Double.parseDouble(truckTokens[2]), Double.parseDouble(truckTokens[3]));
        Vehicle bus = new Bus(Double.parseDouble(busTokens[1]), Double.parseDouble(busTokens[2]), Double.parseDouble(busTokens[3]));

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();

        vehicles.put(carType, car);
        vehicles.put(truckType, truck);
        vehicles.put(busType, bus);

        int countOfCommands = Integer.parseInt(reader.readLine());

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        while (countOfCommands-- > 0) {
            String[] commandTokens = reader.readLine().split("\\s+");

            String command = commandTokens[0];
            String vehicleType = commandTokens[1];
            double parameter = Double.parseDouble(commandTokens[2]);

            if (DRIVE_COMMAND.equals(command)) {
                boolean isTravelled = vehicles.get(vehicleType).drive(parameter, SUMMER_MODE_PERMANENT_ON.get(vehicleType));
                System.out.println(isTravelled ? String.format("%s travelled %s km", vehicleType, decimalFormat.format(parameter)) : String.format("%s needs refueling", vehicleType));

            } else if (DRIVE_EMPTY_BUS_COMMAND.equals(command)) {
                boolean isTravelled;
                isTravelled = vehicles.get(vehicleType).drive(parameter);
                System.out.println(isTravelled ? String.format("%s travelled %s km", vehicleType, decimalFormat.format(parameter)) : String.format("%s needs refueling", vehicleType));

            } else if (REFUEL_COMMAND.equals(command)) {
                try {
                    vehicles.get(vehicleType).refuel(parameter);
                } catch (IllegalArgumentException iae) {
                    System.out.println(iae.getMessage());
                }

            }
        }

        vehicles.values().forEach(System.out::println);
    }
}