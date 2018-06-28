package encapsulation_exercises.ShoppingSpree_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Person> personList = new ArrayList<>();
        HashMap<String, Product> productsMap = new HashMap<>();
        try {
            String[] people = reader.readLine().split(";");
            Arrays.stream(people).forEachOrdered(personData -> {
                int indexOfEqual = personData.indexOf("=");
                String name = personData.substring(0, indexOfEqual);
                double money = Double.valueOf(personData.substring(indexOfEqual + 1));
                Person pesho = new Person(name, money);
                personList.add(pesho);
            });
            String[] products = reader.readLine().split(";");
            Arrays.stream(products).forEachOrdered(productData -> {
                int indexOfEqual = productData.indexOf("=");
                String productName = productData.substring(0, indexOfEqual);
                double productCost = Double.parseDouble(productData.substring(indexOfEqual + 1));
                Product product = new Product(productName, productCost);
                productsMap.put(productName, product);
            });

            while (true) {
                String[] params = reader.readLine().split("\\s+");
                if (params[0].equals("END")) {
                    break;
                }
                String currentPersonName = params[0];
                String productName = params[1];
                personList.stream()
                        .filter(person -> person.getName()
                                .equals(currentPersonName))
                        .forEachOrdered(person -> person.addProduct(productsMap.get(productName)));
            }
            personList.forEach(System.out::println);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}