package workshop3;

public class Qno10 {
        public static void main(String[] args) {
            Qno10 mainInstance = new Qno10();
            mainInstance.showBalance();
        }

        private class bankaccountQn03 {
            private float balance;

            public float getBalance() {
                return balance;
            }

            public void setBalance(float balance) {
                this.balance = balance;
            }
        }

        public void showBalance() {
            bankaccountQn03 account = new bankaccountQn03();
            account.setBalance(7573.5657f);
            System.out.println("Balance: " + account.getBalance());
        }
}
