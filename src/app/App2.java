package app;

import account.Account2;

public class App2 {

    public static void main(String[] args) {

        Account2 a = new Account2("1234");
        a.deposit(500);
        System.out.println(a);

        int rc = a.withdraw(200); // o problema de ter um RC return code é ruim pois terá de providenciar uma tabela para isso
        // o que implica em vários problemas na prática

        if (rc == -2){
            System.out.println("ERROR: not enough funds");
        } else if (rc == -1) {
            System.out.println("ERROR: negative amount");
        } else if (rc == 1) {
            System.out.println("SUCCESS!");
            System.out.println((a));
        }

    }
}
