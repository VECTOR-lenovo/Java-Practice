package workshop3;

public class Qno05 {
    bankaccountQn03 account;

    public static void main(String[] args) {
        Qno05 mainInstance = new Qno05();
        mainInstance.newAttributes();
        mainInstance.Moneydeposit();
        mainInstance.withdrawMoney();
    }

    public void newAttributes() {
        Qno04 task04Instance = new Qno04();
        task04Instance.newAttributes();
        this.account = task04Instance.account;
    }

    public void Moneydeposit() {
        account.depositMoney(500.0f);
    }

    public void withdrawMoney() {
        account.withdrawMoney(200.0f);

    }
}
