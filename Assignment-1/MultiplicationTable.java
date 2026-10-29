import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        if (limit < 1) {
            System.out.println("Invalid limit.");
        } else {
            System.out.println("Multiplication table of " + num);
            for (int i = 1; i <= limit; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }

        sc.close();
    }
}