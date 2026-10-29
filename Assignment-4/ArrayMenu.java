import java.util.Scanner;

public class ArrayMenu {
    static Scanner sc = new Scanner(System.in);

    static void display(int arr[], int n) {
        if (n == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.print("Array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int insert(int arr[], int n) {
        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        if (pos < 1 || pos > n + 1) {
            System.out.println("Invalid position.");
            return n;
        }

        System.out.print("Enter element: ");
        int element = sc.nextInt();

        for (int i = n; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos - 1] = element;
        System.out.println("Element inserted successfully.");
        return n + 1;
    }

    static int delete(int arr[], int n) {
        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        if (pos < 1 || pos > n) {
            System.out.println("Invalid position.");
            return n;
        }

        for (int i = pos - 1; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Element deleted successfully.");
        return n - 1;
    }

    static void search(int arr[], int n) {
        System.out.print("Enter element to search: ");
        int element = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                System.out.println("Element found at position " + (i + 1));
                return;
            }
        }

        System.out.println("Element not found.");
    }

    static void sort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Array sorted successfully.");
    }

    public static void main(String args[]) {
        int arr[] = new int[100];
        int n = 0;
        int choice;

        do {
            System.out.println("\nARRAY OPERATIONS");
            System.out.println("1. Create and Display Array");
            System.out.println("2. Insert Element");
            System.out.println("3. Delete Element");
            System.out.println("4. Search Element");
            System.out.println("5. Sort Array");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of elements (0-100): ");
                    int count = sc.nextInt();

                    if (count < 0 || count > arr.length) {
                        System.out.println("Invalid number of elements.");
                        break;
                    }

                    n = count;
                    System.out.println("Enter " + n + " elements:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    display(arr, n);
                    break;

                case 2:
                    if (n == arr.length) {
                        System.out.println("Array is full.");
                    } else {
                        n = insert(arr, n);
                        display(arr, n);
                    }
                    break;

                case 3:
                    if (n == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        n = delete(arr, n);
                        display(arr, n);
                    }
                    break;

                case 4:
                    search(arr, n);
                    break;

                case 5:
                    sort(arr, n);
                    display(arr, n);
                    break;

                case 6:
                    System.out.println("Program terminated!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);

        sc.close();
    }
}