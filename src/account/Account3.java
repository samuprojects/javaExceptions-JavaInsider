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

    public void withdraw(double amount) throws Exception {
        if (amount < 0){
            // em resumo a RuntimeException não trata pois seria um bug ou algum erro não esperado
            // nesse caso um saque negativo é coisa fora do comum de acontecer e precisa ser corrigino na programação
            throw new Exception("Amount cannot be negative");
        }

        if(balance - amount < 0) {
            // e a CheckedException sabe que pode ocorrer e é tratada
            // aqui é possível pois a pessoa pode ter equivocado quanto ao saldo e ter pedido mais no saque
            throw new Exception("Insufficient funds");
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
