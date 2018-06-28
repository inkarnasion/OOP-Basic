package definingClasses_exercises.OpinionPoll_03;

public class Person {

    public static final String DEFAULT_NAME = "No name";
    public static final int DEFAULT_AGE = 1;

    private String name;
    private int age;

    public Person() {
        this(DEFAULT_NAME, DEFAULT_AGE);
    }

    public Person(int age) {
        this(DEFAULT_NAME, age);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }


    public int getAge() {
        return this.age;
    }


    @Override
    public String toString() {
        return this.getName() + " - " + this.getAge();
    }
}
