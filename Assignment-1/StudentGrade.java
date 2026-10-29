import java.util.Scanner;
public class StudentGrade {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter marks (0-100): ");
  double marks = sc.nextDouble();
  if (marks < 0 || marks > 100) System.out.println("Invalid marks.");
  else if (marks >= 90) System.out.println("Grade: Outstanding");
  else if (marks >= 80) System.out.println("Grade: Excellent");
  else if (marks >= 60) System.out.println("Grade: Average");
  else if (marks >= 40) System.out.println("Grade: Below Average");
  else System.out.println("Grade: Fail");
  sc.close();
 }
}