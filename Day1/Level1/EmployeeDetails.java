class Employee{
String name;
int id;
double salary;

public  Employee(String name, int id, double salary) {//initialize a object using constructor
this.name = name;
this.id = id;
this.salary = salary;
}
public void DisplayDetails(){ //method to display employee details
System.out.println("Employee name : " + name);
System.out.println("Employee id : " + id);
System.out.println("Employee salary : " + salary);
}
}
public class main{
public static void main(String[] args){
Employee employee1 = new Employee("Naman",84,27000); //object
Employee employee2 = new Employee("Om",98,27000);   //object
System.out.println("Employee 1");
employee1.DisplayDetails();
System.out.println("Employee2");
employee2.DisplayDetails();
}
}
