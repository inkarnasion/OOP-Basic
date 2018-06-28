package polymorphism_exercises.wildFarm;

public class Tiger extends Felime {

    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (!food.getClass().getSimpleName().equals("Meat")) {
            throw new IllegalArgumentException(this.getClass().getSimpleName() + "s are not eating that type of food!");
        }

        super.setFoodEaten(super.getFoodEaten() + food.getQuantity());
    }

    @Override
    public String toString() {
        return super.toString();
    }

}