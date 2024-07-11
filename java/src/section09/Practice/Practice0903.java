package section09.Practice;

class BankAccount {
    String accountHolder;
    int balance;

    BankAccount(String accountHolder, int balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
}

class SwapBalance {
    void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("SwapBalance: a = " + a + ", b = " + b);
    }
}

// 아래 코드를 객체에 의한 호출로 수정
class SwapAccounts {
    void swap(BankAccount a, BankAccount b) {
        int temp = a.balance;
        a.balance = b.balance;
        b.balance = temp;
        System.out.println(
                "SwapAccounts: " + a.accountHolder + " = " + a.balance + ", " + b.accountHolder + " = " + b.balance);
    }
}

public class Practice0903 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("김일남", 10000);
        BankAccount account2 = new BankAccount("김이남", 15000);
        SwapBalance sb = new SwapBalance();

        System.out.println("swap() 호출 전: " + account1.accountHolder + " = " + account1.balance + ", "
                + account2.accountHolder + " = " + account2.balance);

        sb.swap(account1.balance, account2.balance);

        System.out.println("swap() 호출 후: " + account1.accountHolder + " = " + account1.balance + ", "
                + account2.accountHolder + " = " + account2.balance);

        System.out.println();

        // 아래 코드를 객체에 의한 호출로 수정
        System.out.println("swap() 호출 전: " + account1.accountHolder + " = " + account1.balance + ", "
                + account2.accountHolder + " = " + account2.balance);
        SwapAccounts sa = new SwapAccounts();
        sa.swap(account1, account2);

        System.out.println("swap() 호출 후: " + account1.accountHolder + " = " + account1.balance + ", "
                + account2.accountHolder + " = " + account2.balance);
    }
}
