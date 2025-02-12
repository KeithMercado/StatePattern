public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account("1234", 10000.0);

        // Activate the account (it is already active)
        myAccount.activate(); // "Account is already activated!"

        // Suspend the account
        myAccount.suspend(); // "Account is suspended!"

        // Activate the account from suspended state
        myAccount.activate(); // "Account is activated!"

        // Deposit to the account
        myAccount.deposit(1000.0); // Updated balance and account info

        // Withdraw from the account
        myAccount.withdraw(100.0); // Updated balance and account info (withdraw all remaining)

        // Close the account
        myAccount.close(); // "Account is closed!"

        // Try to activate a closed account
        myAccount.activate(); // "You cannot activate a closed account!"

        // Try to suspend a closed account
        myAccount.suspend(); // "You cannot suspend a closed account!"

        // Try to withdraw from a closed account
        myAccount.withdraw(500.0); // "You cannot withdraw on a closed account."

        // Try to deposit to a closed account
        myAccount.deposit(1000.0); // "You cannot deposit on a closed account."
    }
}
