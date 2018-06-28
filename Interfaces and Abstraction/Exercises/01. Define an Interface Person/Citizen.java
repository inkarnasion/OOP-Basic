package interfacesAndAbstraction_exercises.defineАnInterfacePerson_01;

public class Citizen implements Person {
    private String Name;
    private Integer Age;

    public Citizen(String name, Integer age) {
        Name = name;
        Age = age;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public Integer getAge() {
        return this.Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
