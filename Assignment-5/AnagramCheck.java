import java.util.Arrays;
import java.util.Scanner;
public class AnagramCheck {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter first string: ");String s1=sc.nextLine();
  System.out.print("Enter second string: ");String s2=sc.nextLine();
  s1=s1.replaceAll("\\s+","").toLowerCase();
  s2=s2.replaceAll("\\s+","").toLowerCase();
  char[] a=s1.toCharArray(),b=s2.toCharArray();Arrays.sort(a);Arrays.sort(b);
  if(Arrays.equals(a,b))System.out.println("The strings are anagrams.");
  else System.out.println("The strings are not anagrams.");
  sc.close();
 }
}