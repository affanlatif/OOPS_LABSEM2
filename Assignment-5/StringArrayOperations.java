import java.util.Scanner;
public class StringArrayOperations {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter number of strings: ");int n=sc.nextInt();sc.nextLine();
  if(n<=0){System.out.println("Invalid number of strings.");sc.close();return;}
  String[] arr=new String[n];
  for(int i=0;i<n;i++){System.out.print("Enter string "+(i+1)+": ");arr[i]=sc.nextLine();}
  System.out.println("\nAll Strings:");for(String s:arr)System.out.println(s);
  String longest=arr[0],shortest=arr[0];
  for(int i=1;i<n;i++){if(arr[i].length()>longest.length())longest=arr[i];if(arr[i].length()<shortest.length())shortest=arr[i];}
  System.out.println("Longest String: "+longest);System.out.println("Shortest String: "+shortest);
  System.out.println("Strings in Reverse Order:");for(int i=n-1;i>=0;i--)System.out.println(arr[i]);
  sc.close();
 }
}