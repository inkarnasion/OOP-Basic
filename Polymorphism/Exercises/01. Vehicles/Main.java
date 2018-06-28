package polymorphism_exercises.venichles_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main
            (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Car car = null;
        Truck truck = null;

        for (int i = 0; i < 2; i++) {
            String[] input = reader.readLine().split("\\s+");

            if (input[0].equals("Car")) {
                car = new Car(Double.parseDouble(input[1]), Double.parseDouble(input[2]));

            } else {
                truck = new Truck(Double.parseDouble(input[1]), Double.parseDouble(input[2]));
            }

        }



        System.out.println(car.toString());

      int number = Integer.parseInt(reader.readLine());
      for (int i = 0; i < number; i++) {
          String[] token = reader.readLine().split("\\s+");

          if (token[0].equals("Drive")) {
              if (token[1].equals("Car")) {
                  car.drive(Double.parseDouble(token[2]));
              } else {
                  truck.drive(Double.parseDouble(token[2]));
              }
          } else {
              if (token[1].equals("Car")) {
                  car.refuel(Double.parseDouble(token[2]));
              } else {
                  truck.refuel(Double.parseDouble(token[2]));
              }
          }
      }

      System.out.printf(car.toString());
      System.out.printf(truck.toString());

    }


}

