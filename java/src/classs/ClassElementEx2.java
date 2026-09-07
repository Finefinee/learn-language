package amiddle.classs;

public class ClassElementEx2 {

    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);

        System.out.println("잔고: " + account.getBalance());
    }
}

class Account {
    int balance;

    Account() {
    }

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족");
            return;
        }
        balance -= amount;
    }

    int getBalance() {
        return balance;
    }
}
