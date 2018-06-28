package definingClasses.bankAccount_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        Map<Integer, BankAccount> accounts = new HashMap<>();

        String line = reader.readLine();

        while (!"End".equals(line)) {
            String[] commandArgs = line.split(" ");
            int id = Integer.parseInt(commandArgs[1]);
            switch (commandArgs[0]) {

                case "Create":
                    if (accounts.containsKey(id)) {
                        System.out.println("Account already exists");
                    } else {
                        BankAccount account = new BankAccount();
                        account.setId(id);
                        accounts.put(id, account);
                    }
                    break;

                case "Deposit":
                    double depositAmmount = Double.parseDouble(commandArgs[2]);
                    if (accounts.get(id) == null) {
                        System.out.println("Account does not exist");
                        break;
                    }
                    accounts.get(id).deposit(depositAmmount);
                    break;

                case "Withdraw":
                    double withdrawAmmount = Double.parseDouble(commandArgs[2]);
                    BankAccount account = accounts.get(id);
                    if (account != null) {
                        if (account.getBalance() < withdrawAmmount) {
                            System.out.println("Insufficient balance");
                        } else {
                            account.withDraw(withdrawAmmount);
                        }
                    } else {
                        System.out.println("Account does not exist");
                    }

                    break;

                case "Print":
                    if (accounts.get(id) == null) {
                        System.out.println("Account does not exist");
                        break;
                    }
                    System.out.println(accounts.get(id));

                    break;
            }

            line = reader.readLine();
        }
    }
}
