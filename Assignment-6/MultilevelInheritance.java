class Person {
 String name; int age;
 Person(String name,int age){this.name=name;this.age=age;}
}
class Employee extends Person {
 int employeeId; double salary;
 Employee(String name,int age,int employeeId,double salary){super(name,age);this.employeeId=employeeId;this.salary=salary;}
}
class Manager extends Employee {
 String department;
 Manager(String name,int age,int employeeId,double salary,String department){super(name,age,employeeId,salary);this.department=department;}
 void display(){System.out.println("Name: "+name);System.out.println("Age: "+age);System.out.println("Employee ID: "+employeeId);System.out.println("Salary: "+salary);System.out.println("Department: "+department);}
}
public class MultilevelInheritance {
 public static void main(String[] args){Manager m=new Manager("Amit",30,101,60000,"Development");m.display();}
}