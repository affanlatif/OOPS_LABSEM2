import java.util.Arrays;
import java.util.Scanner;
public class ArrayMenu {
 static int[] arr = new int[100]; static int size = 0;
 static void create(Scanner sc) {
  System.out.print("Enter number of elements (0-100): "); int n = sc.nextInt();
  if (n < 0 || n > arr.length) { System.out.println("Invalid array size."); return; }
  size = n;
  for (int i = 0; i < size; i++) { System.out.print("Enter element " + (i+1) + ": "); arr[i] = sc.nextInt(); }
 }
 static void display() {
  if (size == 0) { System.out.println("Array is empty."); return; }
  System.out.println("Array: " + Arrays.toString(Arrays.copyOf(arr, size)));
 }
 static void insert(Scanner sc) {
  if (size == arr.length) { System.out.println("Array is full."); return; }
  System.out.print("Enter position (1-" + (size+1) + "): "); int pos = sc.nextInt();
  if (pos < 1 || pos > size+1) { System.out.println("Invalid position."); return; }
  System.out.print("Enter element: "); int value = sc.nextInt();
  for (int i = size; i >= pos; i--) arr[i] = arr[i-1];
  arr[pos-1] = value; size++; System.out.println("Element inserted successfully.");
 }
 static void delete(Scanner sc) {
  if (size == 0) { System.out.println("Array is empty."); return; }
  System.out.print("Enter position to delete (1-" + size + "): "); int pos = sc.nextInt();
  if (pos < 1 || pos > size) { System.out.println("Invalid position."); return; }
  for (int i = pos-1; i < size-1; i++) arr[i] = arr[i+1];
  size--; System.out.println("Element deleted successfully.");
 }
 static void search(Scanner sc) {
  System.out.print("Enter element to search: "); int key = sc.nextInt();
  for (int i = 0; i < size; i++) if (arr[i] == key) {
   System.out.println("Element found at position " + (i+1)); return;
  }
  System.out.println("Element not found.");
 }
 static void sort() { Arrays.sort(arr, 0, size); System.out.println("Array sorted in ascending order."); }
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in); int choice;
  do {
   System.out.println("\n--- ARRAY MENU ---\n1. Create Array\n2. Display Array\n3. Insert Element\n4. Delete Element\n5. Search Element\n6. Sort Array\n7. Exit");
   System.out.print("Enter choice: "); choice = sc.nextInt();
   switch (choice) {
    case 1: create(sc); break; case 2: display(); break; case 3: insert(sc); break;
    case 4: delete(sc); break; case 5: search(sc); break; case 6: sort(); break;
    case 7: System.out.println("Program Terminated!"); break; default: System.out.println("Invalid choice.");
   }
  } while (choice != 7);
  sc.close();
 }
}