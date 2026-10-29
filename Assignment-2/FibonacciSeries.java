import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of terms: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a positive number of terms.");
        } else {
            int first = 0;
            int second = 1;

            System.out.println("Fibonacci Series:");
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;
            }
            System.out.println();
        }

        sc.close();
    }
}