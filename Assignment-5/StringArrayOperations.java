import java.util.Scanner;

public class StringArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 0) {
            System.out.println("Invalid number of strings.");
            sc.close();
            return;
        }

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }

        System.out.println("\nAll Strings:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        String longest = arr[0];
        String shortest = arr[0];
        int longestLength = arr[0].toCharArray().length;
        int shortestLength = arr[0].toCharArray().length;

        for (int i = 1; i < n; i++) {
            int currentLength = arr[i].toCharArray().length;

            if (currentLength > longestLength) {
                longest = arr[i];
                longestLength = currentLength;
            }

            if (currentLength < shortestLength) {
                shortest = arr[i];
                shortestLength = currentLength;
            }
        }

        System.out.println("\nLongest String: " + longest);
        System.out.println("Shortest String: " + shortest);

        System.out.println("\nStrings in Reverse Order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}