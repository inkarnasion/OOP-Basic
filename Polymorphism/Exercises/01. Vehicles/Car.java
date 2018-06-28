package polymorphism_exercises.venichles_01;

public class Car extends Vehicle {
    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    public double getSpecificConsumption() {
        return getFuelConsumption() + 0.9;
    }
}
