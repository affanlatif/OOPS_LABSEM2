class Cat {
 String name; int age;
 Cat() { name = "Unknown"; age = 0; }
 void display() { System.out.println("Name: " + name); System.out.println("Age: " + age); }
}
public class CatDemo {
 public static void main(String[] args) { Cat c = new Cat(); c.display(); }
}