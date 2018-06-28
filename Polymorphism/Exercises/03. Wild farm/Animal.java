package polymorphism_exercises.wildFarm;

public abstract class Animal {


    private String animalName;
    private String animalType;
    private double animalWeight;
    private int foodEaten;

    public Animal(String animalName, String animalType, double animalWeight) {
        this.setAnimalName(animalName);
        this.setAnimalType(animalType);
        this.setAnimalWeight(animalWeight);
        this.setFoodEaten(0);

    }

    public abstract void makeSound();

    public abstract void eat(Food food);

    public int getFoodEaten() {
        return this.foodEaten;
    }

    public void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }

    public String getAnimalName() {
        return this.animalName;
    }

    public double getAnimalWeight() {
        return this.animalWeight;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setAnimalWeight(double animalWeight) {
        this.animalWeight = animalWeight;
    }

}