package definingClasses_exercises.CompanyRoster_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int count = Integer.parseInt(reader.readLine());

        List<Employee> employers = new ArrayList<>();

        while (count-- > 0) {
            String[] input = reader.readLine().split("\\s+");

            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];

            Employee employee = null;
            if (input.length == 4) {
                employee = new Employee(name, salary, position, department);

            } else if (input.length == 5) {
                if (input[4].matches("\\d+")) {
                    int age = Integer.parseInt(input[4]);
                    employee = new Employee(name, salary, position, department, age);
                } else {
                    String email = input[4];
                    employee = new Employee(name, salary, position, department, email);
                }

            } else if (input.length == 6) {
                String email = input[4];
                int age = Integer.parseInt(input[5]);
                employee = new Employee(name, salary, position, department, email, age);

            }

            employers.add(employee);
        }

        Map<String, List<Employee>> map = new HashMap<>();
        for (Employee employer : employers) {
            map.computeIfAbsent(employer.getDepartment(), k -> new ArrayList<>()).add(employer);
        }
        List<Map.Entry<String, List<Employee>>> toSort = new ArrayList<>();
        for (Map.Entry<String, List<Employee>> d : map
                .entrySet()) {
            toSort.add(d);
        }
        toSort.sort((e1, e2) ->
        {
            return Double.compare(
                    e2.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble(),
                    e1.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble()
            );
        });
        long limit = 1;
        for (Map.Entry<String, List<Employee>> d : toSort) {
            if (limit-- == 0) break;
            StringBuilder result = new StringBuilder();
            result.append(String.format("Highest Average Salary: %s", d.getKey()))
                    .append(System.lineSeparator());

            List<Employee> listToSort = new ArrayList<>();
            for (Employee employee : d.getValue()) {
                listToSort.add(employee);
            }
            listToSort.sort(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()));
            for (Employee employee : listToSort) {
                result.append(employee.toString()).append(System.lineSeparator());
            }

            System.out.print(result.toString());
        }

    }
}