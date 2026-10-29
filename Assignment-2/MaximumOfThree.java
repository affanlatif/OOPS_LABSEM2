import java.util.Scanner;

public class MaximumOfThree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first no.: ");
        int a = sc.nextInt();

        System.out.print("Enter the second no.: ");
        int b = sc.nextInt();

        System.out.print("Enter the third no.: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Max. no.: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Max. no.: " + b);
        } else {
            System.out.println("Max. no.: " + c);
        }

        sc.close();
    }
}