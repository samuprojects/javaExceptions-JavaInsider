package app;

import account.Account3;

public class App3 {

    public static void main(String[] args) throws Exception {

        Account3 a = new Account3("1234");
        a.deposit(500);
        System.out.println(a);

        // como esse método pode lançar uma exceção, só vai compilar 1) se tratar essa exceção ou
        // 2) lançar essa exceção para quem fez a chamada ao método main
        // se for tratar a exceção tem que usar o bloco try/ catch que será abordado posteriormente
        //se for lançar pra quem chamou então precisamos informar que o método em que estamos também lança uma exceção
        // como escolhemos a segunda opção vai lançar para a JVM e encerrar com erro
        // outro ponto que é em relação a sintaxe a checked exception precisa ter o throws na assinatura do método;
        // e a RuntimeException não precisa dessa informação (apesar de ser possível usar o throws o que não é comum)
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
