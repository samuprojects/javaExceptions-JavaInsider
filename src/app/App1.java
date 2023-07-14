package app;

import account.Account1;

public class App1 {

    public static void main(String[] args) {

        Account1 a = new Account1("1234");
        a.deposit(500);
        System.out.println(a);
        if (!a.withdraw(1000)){ // usado para mostrar se o saque foi efetuado com sucesso
            System.out.println("ERROR: not enough funds");
        } // resolveu em partes a questão de consistencia do objeto, porém criou um outro
        System.out.println(a); // que seria de tratar o retorno, o que nem sempre é obrigatório
        // porém se assumir que o saque deu certo porque o programa continuou rodando é um erro que pode comprometer o negócio
    }
}
