package workshop3;

class Customer {
    private int customerId;
    private bankaccountQn03 account;

    public Customer(int customerId, bankaccountQn03 account) {
        this.customerId = customerId;
        this.account = account;
    }

    public int getCustomerId() {
        return customerId;
    }

    public bankaccountQn03 getBankAccountNum() {
        return account;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setBankAccountNum(bankaccountQn03 account) {
        this.account = account;
    }
}

public class Qno12 {
    public static void main(String[] args) {
        bankaccountQn03 account = new bankaccountQn03(123, 5000.0f, "Ravi Kumar", "USA");
        Customer customer = new Customer(1, account);
        System.out.println("Customer ID: " + customer.getCustomerId());
        System.out.println("Customer Bank Account Balance: " + customer.getBankAccountNum().balance);
    }
}