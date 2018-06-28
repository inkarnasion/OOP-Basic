package definingClasses_exercises.SpeedRacing_05;

public class Car {

private String model;
private double fuel;
private double costPerKm;
private int distance;

    public Car(String model,double fuel,double costPerKm){
        this.model=model;
        this.fuel=fuel;
        this.costPerKm=costPerKm;
        this.distance=0;
    }

    public String getModel() {
        return this.model;
    }

    public double getFuel() {
        return this.fuel;
    }

    public double getCostPerKm() {
        return this.costPerKm;
    }

    public int getDistance() {
        return this.distance;
    }
    public boolean drive(double kilometers){
        double fuelNeeded = kilometers * this.costPerKm;
        if (fuelNeeded > this.fuel){
            throw new IllegalStateException("Insufficient fuel for the drive");
        }else
        this.distance +=kilometers;
        this.fuel -=fuelNeeded;
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model,this.fuel,this.distance);
    }
}
