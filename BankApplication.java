public class BankingApplication {
    public static void main(String[] args) {
        double initialBalance = 1000.0;
        Account account = new Account(initialBalance);

        double withdrawalAmount = 200.0;
        System.out.println("Current balance: " + account.getBalance());

        if (withdrawalAmount <= account.getBalance()) {
            account.withdraw(withdrawalAmount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
