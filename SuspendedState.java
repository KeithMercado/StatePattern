public class SuspendedState implements AccountState {
    public void deposit(Account account, Double depositAmount) {
        System.out.println("You cannot deposit on a suspended account.");
        System.out.println("Account Number: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
    }

    public void withdraw(Account account, Double withdrawAmount) {
        System.out.println("You cannot withdraw from a suspended account.");
        System.out.println("Account Number: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
    }

    public void activate(Account account) {
        account.setState(new ActiveState());
        System.out.println("Account is activated!");
    }

    public void suspend(Account account) {
        System.out.println("Account is already suspended!");
    }

    public void close(Account account) {
        account.setState(new ClosedState());
        System.out.println("Account is closed!");
    }
}
