import java.util.Scanner;
public class TriangleType {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter three sides: ");
  double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
  if (a <= 0 || b <= 0 || c <= 0 || a+b <= c || a+c <= b || b+c <= a)
   System.out.println("Invalid triangle.");
  else if (a == b && b == c) System.out.println("Equilateral triangle.");
  else if (a == b || b == c || a == c) System.out.println("Isosceles triangle.");
  else System.out.println("Scalene triangle.");
  sc.close();
 }
}