package app;

import account.Account3;

@SuppressWarnings("ALL")
public class App7 {

    public static void main(String[] args) {

        Account3 account = null; // removido para teste da exceção ... new Account3("1234");
        //account.deposit(500);
        //System.out.println(account);

        try {
            account.withdraw(-600);
            System.out.println(account);

            // o conceito de multi catch pode ser usando utilizando um pipe => | separando as exceções
            // o catch só trata as exceções expecificadas nele, se mudar a variável account para null por exemplo
            // a aplicação terminará com erro (código diferente de 0) e com o lançamento de uma NullPointerException genérica
            // para corrigir isso podemos tratar conforme mais abaixo
            // se o Java não encontrar um catch de tratamento correspondente encerrará com erro e exibirá a stacktrace
        } catch (InsufficientFundsException | IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
            System.out.println("Stacktrace:");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("objeto nulo");
        }

        System.out.println("THE END");
    }

}
