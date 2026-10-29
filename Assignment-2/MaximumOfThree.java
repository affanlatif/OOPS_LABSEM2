import java.util.Scanner;
public class MaximumOfThree {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter three numbers: ");
  int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
  int max = a;
  if (b > max) max = b;
  if (c > max) max = c;
  System.out.println("Maximum number: " + max);
  sc.close();
 }
}