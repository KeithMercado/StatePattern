public class ClosedState implements AccountState {
    public void deposit(Account account, Double depositAmount) {
        System.out.println("You cannot deposit on a closed account.");
        System.out.println("Account Number: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
    }

    public void withdraw(Account account, Double withdrawAmount) {
        System.out.println("You cannot withdraw on a closed account.");
        System.out.println("Account Number: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
    }

    public void activate(Account account) {
        System.out.println("You cannot activate a closed account!");
    }

    public void suspend(Account account) {
        System.out.println("You cannot suspend a closed account!");
    }

    public void close(Account account) {
        System.out.println("Account is already closed!");
    }
}
