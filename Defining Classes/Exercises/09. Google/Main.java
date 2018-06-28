package definingClasses_exercises.Google_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> personList = new HashMap<>();

        while (true) {
            String inputLine = reader.readLine();
            if ("End".equals(inputLine)) {
                break;
            }

            String[] tokens = inputLine.split("\\s+");
            String nameOfPerson = tokens[0];

            Person person ;
            person = !personList.containsKey(nameOfPerson) ? new Person(nameOfPerson) : personList.get(nameOfPerson);

            String inputType = tokens[1];
            if ("company".equals(inputType)) {
                String companyName = tokens[2];
                String department = tokens[3];
                double salary = Double.parseDouble(tokens[4]);
                Company company = new Company(companyName, department, salary);

                person.updateCompany(company);

            } else if ("pokemon".equals(inputType)) {
                String pokemonName = tokens[2];
                String pokemonType = tokens[3];
                Pokemon pokemon = new Pokemon(pokemonName, pokemonType);

                person.addPokemonToTheList(pokemon);

            } else if ("parents".equals(inputType)) {
                String parentName = tokens[2];
                String parentBirthday = tokens[3];
                Parent parent = new Parent(parentName, parentBirthday);

                person.addParentToTheList(parent);

            } else if ("children".equals(inputType)) {
                String childName = tokens[2];
                String childBirthday = tokens[3];
                Children children = new Children(childName, childBirthday);

                person.addChildToTheList(children);

            } else if ("car".equals(inputType)) {
                String carModel = tokens[2];
                int carSpeed = Integer.parseInt(tokens[3]);
                Car car = new Car(carModel, carSpeed);

                person.updateCar(car);

            }

            personList.put(nameOfPerson, person);
        }

        String searchedName = reader.readLine();

        Person person = personList.get(searchedName);
        System.out.println(person.getName());

        System.out.println("Company:");
        if (person.getCompany() != null){
            System.out.println(person.getCompany());
        }

        System.out.println("Car:");
        if (person.getCar()!= null){
            System.out.println(person.getCar());
        }

        System.out.println("Pokemon:");
        if (person.getPokemons().size() > 0){
            for (Pokemon pokemon : person.getPokemons()) {
                System.out.println(pokemon);
            }
        }

        System.out.println("Parents:");
        if (person.getParents().size() > 0){
            for (Parent parent: person.getParents()){
                System.out.println(parent);
            }
        }

        System.out.println("Children:");
        if (person.getChildrens().size() > 0){
            for (Children children : person.getChildrens()) {
                System.out.println(children);
            }
        }
    }
}