package workshop3;
public class Qno07 {
    bankaccountQn03 account;

    public static void main(String[] args) {
        Qno07 mainInstance = new Qno07();
        mainInstance.createObj();
        mainInstance.printDetails();
    }

    public void createObj() {
        account = new bankaccountQn03(123456789, 1000.0f, "Ravi Kumar", "USA");
    }

    public void printDetails() {
        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Account Balance: " + account.balance);
        System.out.println("Account Holder Name: " + account.accountHolderName);
        System.out.println("Account Holder Address: " + account.accountHolderAddress);
    }
}
