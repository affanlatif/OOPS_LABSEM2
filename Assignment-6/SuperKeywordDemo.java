class Person {
 String name="Parent Name";
 void display(){System.out.println("Person Name: "+name);}
}
class Student extends Person {
 String name="Student Name";
 @Override void display(){System.out.println("Student Name: "+name);System.out.println("Superclass Name: "+super.name);super.display();}
}
public class SuperKeywordDemo {
 public static void main(String[] args){Student s=new Student();s.display();}
}