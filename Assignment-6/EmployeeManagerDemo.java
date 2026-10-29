class Employee {
 String name; double salary;
 Employee(String name,double salary){this.name=name;this.salary=salary;}
 void display(){System.out.println("Name: "+name);System.out.println("Salary: "+salary);}
}
class Manager extends Employee {
 String department;
 Manager(String name,double salary,String department){super(name,salary);this.department=department;}
 @Override void display(){super.display();System.out.println("Department: "+department);}
}
public class EmployeeManagerDemo {
 public static void main(String[] args){Manager m=new Manager("Rahul",50000,"IT");m.display();}
}