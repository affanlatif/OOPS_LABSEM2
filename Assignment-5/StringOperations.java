import java.util.Scanner;
public class StringOperations {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in); System.out.print("Enter a string: "); String str=sc.nextLine();
  System.out.println("Length: "+str.length()); System.out.println("Uppercase: "+str.toUpperCase()); System.out.println("Lowercase: "+str.toLowerCase());
  System.out.print("Enter character position (1-"+str.length()+"): "); int pos=sc.nextInt();
  if(pos>=1 && pos<=str.length()) System.out.println("Character: "+str.charAt(pos-1)); else System.out.println("Invalid position.");
  System.out.print("Enter substring start index: "); int start=sc.nextInt();
  System.out.print("Enter substring end index: "); int end=sc.nextInt();
  if(start>=0 && end>=start && end<=str.length()) System.out.println("Substring: "+str.substring(start,end));
  else System.out.println("Invalid substring indices.");
  sc.close();
 }
}