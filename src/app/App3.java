package app;

import account.Account3;

public class App3 {

    public static void main(String[] args) {

        Account3 a = new Account3("1234");
        a.deposit(500);
        System.out.println(a);

        a.withdraw(600);
        System.out.println(a);

        System.out.println("Success!");
        }
    // sobre a stacktrace é importante para rastrear o problema
    // no caso desse código a primeira linha vai informar o erro
    // e na sequencia a pilha de chamadas que ocorreu sendo necessário acompanhar debaixo para cima (está "empilhado")
    // uma curiosidade é que em relação ao sistema operacional quando é finalizado com erro informa qualquer código
    // diferente de zero.
    }
