package account;

public class AccountService {

    public void createdAndWithdraw(String accountNumber, double amount) throws ServiceException {

        Account3 account = new Account3(accountNumber);
        account.deposit(1000);

        try {
            account.withdraw(amount);
        } catch (InsufficientFundsException e) {
            throw new ServiceException("Error during withdraw", e);
        }
        // diferente do passo anterior que era apenas esconder as coisas do que está acontecendo internamente
        // podemos fazer o inverso e detalhar o histórico dos problemas ao aninhar a exceção original com
        // a causa dentro da exceção que estamos criando conforme feito acima, esse é o cenário mais comum no dia a dia
        // outro ponto sinalizado é nunca deixar o catch (tratamento da exceção) vazio, pelo menos a stacktrace deve ser impressa
        // para caso aconteça alguma coisa poder verificar em log a ocorrência.


    }

}
