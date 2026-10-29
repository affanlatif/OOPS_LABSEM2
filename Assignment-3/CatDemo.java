class Cat {
    String name;
    int age;

    Cat() {
        name = "Unknown";
        age = 0;
    }
}

public class CatDemo {
    public static void main(String args[]) {
        Cat c = new Cat();

        System.out.println("Name: " + c.name);
        System.out.println("Age : " + c.age);
    }
}