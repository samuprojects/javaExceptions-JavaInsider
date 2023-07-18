package app;

import account.Account3;

public class App8 {

    public static void main(String[] args) {

        Account3 account = new Account3("1234");
        account.deposit(500);
        System.out.println(account);

        try {
            account.withdraw(600);
            System.out.println(account);

            // Se trocar algum tratamento de exceção por Exception no catch, simplesmente vai tratar tudo que aparecer
            // isso ocorre por causa da herança, tanto as checked quanto as uncheked exceptions herdam de Exception
            // Se tentar incluir outros catch após não vai funcionar porque a super já está na frente, porém, se
            // inverter aí fará mais sentido, tratando as específicas primeiro e deixando outras num último catch com Exception
        } catch (InsufficientFundsException e) {
            System.out.println("Exception");
        }
    }
}
