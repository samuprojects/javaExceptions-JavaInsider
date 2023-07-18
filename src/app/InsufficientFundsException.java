package app;

@SuppressWarnings("ALL")
public class InsufficientFundsException extends Exception {

    private final double currentBalance;

    public InsufficientFundsException(double currentBalance) {
        super("There is no sufficient funds to withdraw");
        this.currentBalance = currentBalance;
    }

    public double getCurrentBalance(){
        return currentBalance;
    }
}
