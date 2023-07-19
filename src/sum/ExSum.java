package sum;

import java.util.Scanner;

public class ExSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // cria objeto para leitura da digitação do usuário

        int number1 = readNumber(scanner); // criação de variável com método para receber a digitação 1 do usuário
        int number2 = readNumber(scanner); // criação de variável com método para receber a digitação 2 do usuário

        System.out.println("Resposta: " + (number1 + number2)); // soma os números conforme enunciado
    }

    private static int readNumber(Scanner scanner) { // método criado para solicitar números no console
        System.out.println("Digite o número: ");
        try { // bloco try para receber a digitação do número inteiro pelo usuário
            return Integer.parseInt(scanner.nextLine()); // como Scanner retorna String convertemos com parseInt + nextLine para próximo número
        } catch (NumberFormatException e) { // bloco catch para tratamento da exceção do tipo NumberFormatException caso usuário digite outra coisa que não seja número inteiro
            System.out.println("ALERTA: Assumindo valor 10"); // exibe alerta sobre assumir o valor inteiro 10;
            return 10; // retorna o número inteiro 10, ou seja, sempre que o usuário digitar valor inválido vai atribuir 10 conforme enunciado
        }
    }
}
