package definingClasses.bankAccount_01;

public class BankAccount {

    private int id;
    private double balance;


    public void setId(int id) {

        this.id = id;
    }

    public int getId() {

        return this.id;
    }

    public double getBalance() {

        return this.balance;
    }

    public void deposit(double amount) {

        this.balance += amount;
    }

    public void withDraw(double amount)
    {
        if (this.getBalance() < amount){
            throw new IllegalArgumentException("Insuficient balance");
        }
        this.balance -= amount;
    }

    @Override
    public String toString() {

        return String.format("Account ID%d, balance %.2f", this.getId(), this.getBalance());
    }
}
