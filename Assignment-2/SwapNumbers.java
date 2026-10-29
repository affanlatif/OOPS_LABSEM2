import java.util.Scanner;
public class SwapNumbers {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter two numbers: ");
  int a = sc.nextInt(), b = sc.nextInt();
  System.out.println("Before swapping: a = " + a + ", b = " + b);
  int temp = a; a = b; b = temp;
  System.out.println("After swapping: a = " + a + ", b = " + b);
  sc.close();
 }
}