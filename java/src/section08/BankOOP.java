package section08;

class BankAccount {
    int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void printBalance() {
        System.out.println("잔액: " + balance);
    }
}

public class BankOOP {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();

        account1.deposit(1000);
        account1.printBalance();

        account1.deposit(1000);
        account1.printBalance();

        System.out.println();

        BankAccount account2 = new BankAccount();

        account2.deposit(10000);
        account2.printBalance();
        account2.deposit(4000);
        account2.printBalance();

        // cmd + d 누르면 같은 글자 동시에 수정 가능
        
    }
}
