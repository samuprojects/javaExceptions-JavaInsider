package account;

public class Account2 {

    private final String number;
    private double balance;

    public Account2(String number) {
        this.number = number;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public int withdraw(double amount){ // com o boolean o retorno poderia significar várias coisas
        // uma outra forma que usam em linguagens que não possuem gerenciamento de exceções é
        // criar "magic numbers", códigos de erros para cada tipo de problema que surgir
        // o que resultaria em um código de sucesso para vários outros de erros.
        if (amount < 0){
            return -1;
        }

        if(balance - amount >= 0) {
            this.balance -= amount;
            return 1;
        }
        return -2;
    }

    @Override
    public String toString() {
        return "Account1{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
