package app;

import account.Account3;

public class App3 {

    public static void main(String[] args) {

        Account3 a = new Account3("1234");
        a.deposit(500);
        System.out.println(a);

        a.withdraw(600); // com saque maior ou negativo um aviso de RuntimeException vai parar a aplicação com falha
        System.out.println(a); // ou seja o erro não será ignorado e nesse caso quem chamou pode tratar o erro

        System.out.println("Success!");
        }

    }
