package definingClasses.staticIdandInterestRate_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String line = reader.readLine();
            if ("End".equals(line)){
                break;
            }
            String[] token = line.split("\\s+");
            switch (token[0]) {
                case "Create":
                    BankAccount bank = new BankAccount();
                    break;
                case "Deposit":
                    BankAccount.deposit(Integer.parseInt(token[1]),Double.parseDouble(token[2]));
                    break;
                case "SetInterest":
                    BankAccount.setInterestRate(Double.parseDouble(token[1]));
                    break;
                case "GetInterest":
                    BankAccount.getInterest(Integer.parseInt(token[1]),Integer.parseInt(token[2]));
                    break;
            }
        }
    }
}