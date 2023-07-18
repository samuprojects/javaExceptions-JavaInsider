package app;

import account.Account3;

public class App9 {

    public static void main(String[] args) throws Exception {

        Account3 account = new Account3("1234");
        account.deposit(500);
        System.out.println(account);

        try {
            account.withdraw(600);
            System.out.println(account);

        } finally {
            System.out.println("THE END");
        }

        // O bloco finally está sempre associado à um bloco try (mas a nenhum catch) e sempre tem
        // seu código executado, quando utilizado, mesmo em cenários de não tratamento da exceção
        // como no exemplo acima que em a classe main joga para a JVM que executa o finally depois encerra
        // a aplicação com erro (código diferente de zero para o S.O.)
    }
}
