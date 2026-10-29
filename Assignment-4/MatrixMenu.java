import java.util.Scanner;
public class MatrixMenu {
 static Scanner sc = new Scanner(System.in);
 static int[][] readMatrix(String name) {
  System.out.print("Enter rows and columns of " + name + ": ");
  int r = sc.nextInt(), c = sc.nextInt();
  if (r <= 0 || c <= 0 || r > 20 || c > 20) { System.out.println("Invalid matrix dimensions."); return null; }
  int[][] a = new int[r][c]; System.out.println("Enter matrix elements:");
  for (int i=0;i<r;i++) for (int j=0;j<c;j++) a[i][j]=sc.nextInt();
  return a;
 }
 static void display(int[][] a) {
  if (a == null) { System.out.println("Matrix not created."); return; }
  for (int[] row : a) { for (int value : row) System.out.print(value + "\t"); System.out.println(); }
 }
 static void add(int[][] a, int[][] b) {
  if (a==null || b==null || a.length!=b.length || a[0].length!=b[0].length) { System.out.println("Addition not possible."); return; }
  int[][] r=new int[a.length][a[0].length];
  for(int i=0;i<a.length;i++) for(int j=0;j<a[0].length;j++) r[i][j]=a[i][j]+b[i][j];
  System.out.println("Matrix Addition:"); display(r);
 }
 static void subtract(int[][] a, int[][] b) {
  if (a==null || b==null || a.length!=b.length || a[0].length!=b[0].length) { System.out.println("Subtraction not possible."); return; }
  int[][] r=new int[a.length][a[0].length];
  for(int i=0;i<a.length;i++) for(int j=0;j<a[0].length;j++) r[i][j]=a[i][j]-b[i][j];
  System.out.println("Matrix Subtraction:"); display(r);
 }
 static void multiply(int[][] a, int[][] b) {
  if (a==null || b==null || a[0].length!=b.length) { System.out.println("Multiplication not possible."); return; }
  int[][] r=new int[a.length][b[0].length];
  for(int i=0;i<a.length;i++) for(int j=0;j<b[0].length;j++) for(int k=0;k<a[0].length;k++) r[i][j]+=a[i][k]*b[k][j];
  System.out.println("Matrix Multiplication:"); display(r);
 }
 public static void main(String[] args) {
  int[][] a=null,b=null; int choice;
  do {
   System.out.println("\n--- MATRIX MENU ---\n1. Create Matrices\n2. Display Matrices\n3. Matrix Addition\n4. Matrix Subtraction\n5. Matrix Multiplication\n6. Exit");
   System.out.print("Enter choice: "); choice=sc.nextInt();
   switch(choice) {
    case 1: a=readMatrix("A"); b=readMatrix("B"); break;
    case 2: System.out.println("Matrix A:"); display(a); System.out.println("Matrix B:"); display(b); break;
    case 3: add(a,b); break; case 4: subtract(a,b); break; case 5: multiply(a,b); break;
    case 6: System.out.println("Program Terminated!"); break; default: System.out.println("Invalid choice.");
   }
  } while(choice!=6);
  sc.close();
 }
}