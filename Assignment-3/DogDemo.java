class Dog {
 String name, color;
 Dog(String name, String color) { this.name = name; this.color = color; }
 void display() { System.out.println("Name: " + name); System.out.println("Color: " + color); }
}
public class DogDemo {
 public static void main(String[] args) { Dog d = new Dog("Bruno", "Brown"); d.display(); }
}