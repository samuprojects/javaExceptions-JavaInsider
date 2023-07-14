package account;

public class Account3 {

    private final String number;
    private double balance;

    public Account3(String number) {
        this.number = number;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0){
            throw new RuntimeException("Amount cannot be negative");
        }

        if(balance - amount < 0) {
            throw new RuntimeException("Insufficient funds");
        }

        this.balance-= amount;
    }

    @Override
    public String toString() {
        return "Account1{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
