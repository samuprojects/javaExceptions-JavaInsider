package account;

public class AccountService {

    public void createdAndWithdraw(String accountNumber, double amount) throws ServiceException {

        Account3 account = new Account3(accountNumber);
        account.deposit(1000);

        try {
            account.withdraw(amount);
        } catch (InsufficientFundsException e) { // capturamos a exceção original e ...
            throw new ServiceException(e.getMessage()); // lançamos na nova reaproveitando da antiga apenas a mensagem
        } // na stacktrace da aplicação vai exibir apenas "como um serviço de exceção" passando o problema
        // é como esconder algumas coisas internas lembrar do drywall

    }

}
