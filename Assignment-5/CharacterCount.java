import java.util.Scanner;
public class CharacterCount {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in); System.out.print("Enter a sentence: "); String str=sc.nextLine();
  int vowels=0, consonants=0, digits=0, spaces=0, special=0;
  for(int i=0;i<str.length();i++) {
   char ch=str.charAt(i);
   if(Character.isLetter(ch)) {
    char lower=Character.toLowerCase(ch);
    if(lower=='a'||lower=='e'||lower=='i'||lower=='o'||lower=='u') vowels++; else consonants++;
   } else if(Character.isDigit(ch)) digits++; else if(ch==' ') spaces++; else special++;
  }
  System.out.println("Vowels: "+vowels); System.out.println("Consonants: "+consonants);
  System.out.println("Digits: "+digits); System.out.println("Spaces: "+spaces); System.out.println("Special Characters: "+special);
  sc.close();
 }
}