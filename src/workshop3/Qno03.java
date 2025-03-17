package workshop3;
class bankaccountQn03 {
    int accountNumber;
    float balance;
    String accountHolderName, accountHolderAddress;

    public bankaccountQn03(int accountNumber, float balance, String accountHolderName, String accountHolderAddress) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountHolderAddress = accountHolderAddress;
    }

    public bankaccountQn03() {
        System.out.println("User has been created");
    }

    public void depositMoney(float amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdrawMoney(float amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }
}
