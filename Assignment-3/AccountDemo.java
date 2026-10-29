import java.util.Scanner;

class Account {
    String accountNumber;
    double balance;
    boolean valid;

    Account(String accountNumber, double balance) {
        valid = true;

        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            System.out.println("Error: Account No. cannot be empty.");
            valid = false;
        } else if (balance < 0) {
            System.out.println("Error: Balance cannot be negative.");
            valid = false;
        } else {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
    }

    void display() {
        if (valid) {
            System.out.println("Account No.: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }
}

public class AccountDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account no.: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        Account a = new Account(accountNumber, balance);
        a.display();

        sc.close();
    }
}