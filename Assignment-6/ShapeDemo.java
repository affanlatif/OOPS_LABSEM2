class Shape { void display(){System.out.println("This is a shape.");} }
class Circle extends Shape {
 double radius; Circle(double radius){this.radius=radius;}
 @Override void display(){super.display();System.out.println("Area of Circle: "+(Math.PI*radius*radius));}
}
class Rectangle extends Shape {
 double length,breadth; Rectangle(double length,double breadth){this.length=length;this.breadth=breadth;}
 @Override void display(){super.display();System.out.println("Area of Rectangle: "+(length*breadth));}
}
public class ShapeDemo {
 public static void main(String[] args){Circle c=new Circle(5);Rectangle r=new Rectangle(4,6);c.display();r.display();}
}