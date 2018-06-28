package polymorphism_exercises.wildFarm;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String animalInfo;
        List<Animal> animals = new ArrayList<>();
        while (true) {
            if ("End".equals(animalInfo = reader.readLine()))
                break;
            String[] animalArgs = animalInfo.split(" ");
            String animalType = animalArgs[0];
            String name = animalArgs[1];
            Double weight = Double.parseDouble(animalArgs[2]);
            String livingRegion = animalArgs[3];

            try {
                Animal animal;
                if ("Mouse".equals(animalType)) {
                    animal = new Mouse(name, animalType, weight, livingRegion);

                } else if ("Zebra".equals(animalType)) {
                    animal = new Zebra(name, animalType, weight, livingRegion);

                } else if ("Cat".equals(animalType)) {
                    animal = new Cat(name, animalType, weight, livingRegion, animalArgs[4]);

                } else if ("Tiger".equals(animalType)) {
                    animal = new Tiger(name, animalType, weight, livingRegion);

                } else {
                    throw new IllegalArgumentException("Invalid animal type!");
                }

                String[] foodArgs = reader.readLine().split(" ");
                String foodType = foodArgs[0];
                Integer quantity = Integer.parseInt(foodArgs[1]);

                Food food;
                if ("Vegetable".equals(foodType)) {
                    food = new Vegetable(quantity);

                } else if ("Meat".equals(foodType)) {
                    food = new Meat(quantity);

                } else {
                    throw new IllegalArgumentException("Invalid food type!");
                }

                animal.makeSound();
                try {
                    animal.eat(food);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }

                animals.add(animal);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        for (Animal a : animals) {
            System.out.println(a.toString());
        }

    }
}