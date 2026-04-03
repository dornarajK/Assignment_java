package StaticsPackages_3_3;

public class BankAccount {
    private static int totalAccount = 0;
    private double balance;
    private int accountNumber;

    public BankAccount(double balance){
        totalAccount++;
        this.accountNumber = totalAccount;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (0 < amount){
            balance += amount;
        }
    }

    public void withdraw(double amount){
        if (0 < amount && amount <= balance){
            balance -= amount;
        }
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public static int getTotalAccounts() {
        return totalAccount;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}

