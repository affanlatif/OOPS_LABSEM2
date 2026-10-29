import java.util.Scanner;
public class EvenOddZero {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a number: ");
  int n = sc.nextInt();
  if (n == 0) System.out.println("The number is zero.");
  else if (n % 2 == 0) System.out.println("The number is even.");
  else System.out.println("The number is odd.");
  sc.close();
 }
}