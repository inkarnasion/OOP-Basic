package definingClasses_exercises.Google_09;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private List<Pokemon> pokemons;
    private List<Parent> parents;
    private List<Children> childrens;
    private Car car;

    public Person(String name) {
        this.pokemons = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.childrens = new ArrayList<>();

        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Company getCompany() {
        return this.company;
    }

    public Car getCar() {
        return this.car;
    }

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }

    public List<Parent> getParents() {
        return this.parents;
    }

    public List<Children> getChildrens() {
        return this.childrens;
    }

    public void updateCompany(Company company) {
        this.company = company;
    }

    public void addPokemonToTheList(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public void addParentToTheList(Parent parent) {
        this.parents.add(parent);
    }

    public void addChildToTheList(Children children) {
        this.childrens.add(children);
    }

    public void updateCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return String.format("%s", this.name);
    }
}