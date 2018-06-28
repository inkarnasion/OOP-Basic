package inheritance_exercises.mankind_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main
            (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {

            String[] studentInfo = reader.readLine().split("\\s+");

            String firstNameStudent = studentInfo[0];
            String secondNameStudent = studentInfo[1];
            String facilityNumber = studentInfo[2];

            Student student = new Student(firstNameStudent, secondNameStudent, facilityNumber);

            System.out.println(student.toString());

            String[] workerInfo = reader.readLine().split("\\s+");

            String firstNameWorker = workerInfo[0];
            String secondNameWorker = workerInfo[1];

            double weekSalary = Double.parseDouble(workerInfo[2]);
            double workingHours = Double.parseDouble(workerInfo[3]);

            Worker worker = new Worker(firstNameWorker, secondNameWorker, weekSalary, workingHours);

            System.out.println(worker.toString());

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}