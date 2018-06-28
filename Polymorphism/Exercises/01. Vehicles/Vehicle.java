package polymorphism_exercises.venichles_01;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelQuantity() {
        return this.fuelQuantity;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public void drive(double distance) {
        DecimalFormat df = new DecimalFormat("#.##");
        double consumerFuel = distance * (getSpecificConsumption());
        if (consumerFuel > getFuelQuantity()) {
            System.out.println(this.getClass().getSimpleName() + " needs refueling");
        } else {
            fuelQuantity-=consumerFuel;
            System.out.printf(this.getClass().getSimpleName() + " travelled %s km\n", df.format(distance));
        }
    }

    public abstract double getSpecificConsumption();

    public void refuel(final double liters){
        fuelQuantity+=liters;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " +String.format("%.2f%n", getFuelQuantity());
    }
}
