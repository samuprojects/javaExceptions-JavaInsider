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

    public void withdraw(double amount) throws Exception { // o throws vai na assinatura do método e indica que pode ser lançado uma exceção
        if (amount < 0){ // quem faz a chamada tem que ter ciência disso e escolher o que fazer
            // para lançar a exceção usamos o throw no singular e encerra o método
            throw new Exception("Amount cannot be negative");
        }

        if(balance - amount < 0) {
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
