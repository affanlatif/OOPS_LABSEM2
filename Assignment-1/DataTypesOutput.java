import java.util.Scanner;

public class DataTypesOutput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.print("Enter a float: ");
        float decimal = sc.nextFloat();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        System.out.print("Enter a boolean (true/false): ");
        boolean value = sc.nextBoolean();

        System.out.println("\nEntered Values:");
        System.out.println("Integer = " + num);
        System.out.println("Float = " + decimal);
        System.out.println("Character = " + ch);
        System.out.println("Boolean = " + value);

        sc.close();
    }
}