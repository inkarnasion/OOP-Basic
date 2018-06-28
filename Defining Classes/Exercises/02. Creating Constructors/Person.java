package definingClasses_exercises.creatingConstructors_02;

public class Person {

    private int age;
    private String name;

    Person() {
        this.age = 1;
        this.name = "No name";
    }

    Person(int age) {
        this.name = "No name";
        this.age = age;
    }

    Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge()
    {
        return this.age;
    }


    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}