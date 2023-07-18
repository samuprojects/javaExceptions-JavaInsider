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
            System.out.println("Ops... pouco dinheiro. Só existe " + e.getCurrentBalance());

        } catch (IllegalArgumentException e) { // um bloco try pode estar associado a mais de um bloco catch
            // o Java nunca executará dois blocos catch
            System.out.println("O valor não pode ser negativo");

            // Detalhe importante: com o tratamento da exceção a aplicação é encerrada com código 0, ou seja, sem erros inesperados.
            // Outro ponto: o tipo de objeto que as variáveis usadas referenciam apontam para o mesmo objeto do throw new de Account3
            // ou seja, um throw de um objeto é recuperado no catch por isso podemos mostrar o getCurrentBalance

            System.out.println("THE END");
        }

    }
}
