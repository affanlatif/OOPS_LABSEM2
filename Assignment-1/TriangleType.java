import java.util.Scanner;

public class TriangleType {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first side: ");
        int a = sc.nextInt();

        System.out.print("Enter the second side: ");
        int b = sc.nextInt();

        System.out.print("Enter the third side: ");
        int c = sc.nextInt();

        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Invalid triangle");
        } else if (a == b && b == c) {
            System.out.println("Equilateral");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }

        sc.close();
    }
}