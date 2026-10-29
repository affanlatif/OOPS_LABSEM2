import java.util.Scanner;

public class StudentGrade {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        } else if (marks >= 90) {
            System.out.println("Outstanding");
        } else if (marks >= 80) {
            System.out.println("Excellent");
        } else if (marks >= 60) {
            System.out.println("Average");
        } else if (marks >= 40) {
            System.out.println("Below Average");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}