import java.util.Scanner;

public class EvenOddZero {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("The no. is zero");
        } else if (num % 2 == 0) {
            System.out.println("The no. is even");
        } else {
            System.out.println("The no. is odd");
        }

        sc.close();
    }
}