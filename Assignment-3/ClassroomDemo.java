import java.util.Scanner;

class Classroom {
    String className;
    String[] students;

    Classroom(String className, String[] students) {
        this.className = className;
        this.students = students;
    }

    void display() {
        System.out.println("\nClass Name: " + className);
        System.out.println("Students:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}

public class ClassroomDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter class name: ");
        String className = sc.nextLine();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n < 0) {
            System.out.println("Invalid number of students.");
            sc.close();
            return;
        }

        String[] students = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student " + (i + 1) + " name: ");
            students[i] = sc.nextLine();
        }

        Classroom classroom = new Classroom(className, students);
        classroom.display();

        sc.close();
    }
}