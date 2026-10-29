public class StringComparison {
 public static void main(String[] args) {
  String s1="Java",s2="Java",s3=new String("Java");
  System.out.println("s1 == s2: "+(s1==s2));
  System.out.println("s1 == s3: "+(s1==s3));
  System.out.println("s1.equals(s3): "+s1.equals(s3));
 }
}