package polymorphism_exercises.venichles_01;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    public double getSpecificConsumption() {
        return getFuelConsumption() + 1.6;
    }

    @Override
    public void refuel(double liters) {
        double truckRealLiters = liters * 0.95;
        super.setFuelQuantity(getFuelQuantity() + truckRealLiters);
    }
}
