class Account {
 String accountNumber; double balance;
 Account(String accountNumber, double balance) {
  if (accountNumber == null || accountNumber.trim().isEmpty())
   throw new IllegalArgumentException("Account number cannot be empty.");
  if (balance < 0) throw new IllegalArgumentException("Balance cannot be negative.");
  this.accountNumber = accountNumber; this.balance = balance;
 }
 void display() { System.out.println("Account Number: " + accountNumber); System.out.println("Balance: " + balance); }
}
public class AccountDemo {
 public static void main(String[] args) {
  try { Account a = new Account("ACC101", 5000.0); a.display(); }
  catch (IllegalArgumentException e) { System.out.println("Error: " + e.getMessage()); }
 }
}