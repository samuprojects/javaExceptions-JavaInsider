package app;

import account.Account3;

public class App5 {

    public static void main(String[] args) {

        Account3 account = new Account3("1234");
        account.deposit(500);
        System.out.println(account);

        try{ // como withdraw lança uma checked exception precisamos tratá-la com try / catch
            account.withdraw(600);
            System.out.println(account);
        } catch (InsufficientFundsException e) { // se o try não puder ser executado entra no catch e lança a exceção
            // caso o try funcione jamais o catch será chamado
            System.out.println("Ops... pouco dinheiro");
        }

    }
}
