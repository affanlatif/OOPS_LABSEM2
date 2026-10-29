class Employee {
 int employeeId; String name; double basicSalary;
 Employee(int employeeId,String name,double basicSalary){this.employeeId=employeeId;this.name=name;this.basicSalary=basicSalary;}
 double calculateSalary(){return basicSalary;}
 void display(){System.out.println("Employee ID: "+employeeId);System.out.println("Name: "+name);System.out.println("Basic Salary: "+basicSalary);System.out.println("Final Salary: "+calculateSalary());}
}
class Developer extends Employee {
 Developer(int id,String name,double salary){super(id,name,salary);}
 @Override double calculateSalary(){return basicSalary+basicSalary*0.20;}
}
class Manager extends Employee {
 Manager(int id,String name,double salary){super(id,name,salary);}
 @Override double calculateSalary(){return basicSalary+basicSalary*0.30;}
}
public class SalaryDemo {
 public static void main(String[] args){Developer d=new Developer(101,"Riya",40000);Manager m=new Manager(102,"Amit",50000);System.out.println("--- Developer Details ---");d.display();System.out.println("\n--- Manager Details ---");m.display();}
}