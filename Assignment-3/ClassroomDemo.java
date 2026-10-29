class Classroom {
 String className; String[] students;
 Classroom(String className, String[] students) { this.className = className; this.students = students; }
 void display() {
  System.out.println("Class Name: " + className); System.out.println("Students:");
  for (String student : students) System.out.println(student);
 }
}
public class ClassroomDemo {
 public static void main(String[] args) {
  String[] names = {"Amit", "Riya", "Rahul"};
  Classroom c = new Classroom("CSE-A", names); c.display();
 }
}