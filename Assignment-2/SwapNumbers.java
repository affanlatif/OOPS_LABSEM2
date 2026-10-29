import java.util.Scanner;

public class SwapNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first no.: ");
        int first = sc.nextInt();

        System.out.print("Enter second no.: ");
        int second = sc.nextInt();

        System.out.println("Before Swapping:");
        System.out.println("First no. = " + first);
        System.out.println("Second no. = " + second);

        int temp = first;
        first = second;
        second = temp;

        System.out.println("After Swapping:");
        System.out.println("First no. = " + first);
        System.out.println("Second no. = " + second);

        sc.close();
    }
}