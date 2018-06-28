package definingClasses_exercises.RawData_06;

import java.util.List;

public class Car {

    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tires;

    public Car(String model,Engine engine,Cargo cargo, List<Tire>tires){
        this.model=model;
        this.engine = engine;
        this.cargo=cargo;
        this.tires=tires;
    }

    public String getModel() {
        return this.model;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Cargo getCargo() {
        return this.cargo;
    }

    public List<Tire> getTires() {
        return this.tires;
    }

    @Override
    public String toString() {
        return this.getModel();
    }
}
