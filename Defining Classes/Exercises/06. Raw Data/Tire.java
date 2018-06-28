package definingClasses_exercises.RawData_06;

public class Tire {
    private int age;
    private double pressure;

    public Tire(int age,double ppresure){
        this.age=age;
        this.pressure=ppresure;

    }

    public int getAge() {
        return this.age;
    }

    public double getPressure() {
        return this.pressure;
    }
}
