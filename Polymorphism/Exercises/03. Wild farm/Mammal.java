package polymorphism_exercises.wildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;

    }

    public String getLivingRegion() {
        return this.livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %d]", super.getAnimalType(), super.getAnimalName(),
                new DecimalFormat("0.##").format(super.getAnimalWeight()), livingRegion, super.getFoodEaten());
    }
}