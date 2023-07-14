package account;

public class Account1 {

    private final String number;
    private double balance;

    public Account1(String number) {
        this.number = number;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    // no Java não é obrigado a tratar o retorno de um método, para identificar se um saque foi realizado com sucesso
    // deveria realizar uma checagem conforme utilizado na classe executável como exemplo simples
    public boolean withdraw(double amount){ // usado apenas para fins didádicos essa validação
        if(balance - amount >= 0) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account1{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
