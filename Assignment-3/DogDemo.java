import java.util.Scanner;

class Dog {
    String name;
    String color;

    Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

public class DogDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dog name: ");
        String dogName = sc.nextLine();

        System.out.print("Enter dog color: ");
        String dogColor = sc.nextLine();

        Dog d = new Dog(dogName, dogColor);

        System.out.println("Name : " + d.name);
        System.out.println("Color: " + d.color);

        sc.close();
    }
}