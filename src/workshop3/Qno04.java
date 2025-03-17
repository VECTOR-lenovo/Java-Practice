package workshop3;

public class Qno04 {
    bankaccountQn03 account;

    public static void main(String[] args) {
        Qno04 mainInstance = new Qno04();
        mainInstance.newAttributes();
        mainInstance.printDetails();
    }

    public void newAttributes() {
        account = new bankaccountQn03(123, 1000.0f, "Ravi Kumar", "USA");
    }

    public void printDetails() {
        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Account Balance: " + account.balance);
        System.out.println("Account Holder Name: " + account.accountHolderName);
        System.out.println("Account Holder Address: " + account.accountHolderAddress);
    }
}
