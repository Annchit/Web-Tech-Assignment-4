import java.util.Scanner;

class Employee{

    String employeeName;
    int yearOfJoining;
    double salary;
    String address;
    
    // Constructor for defining the object of Employee
    Employee(String employeeName,int yearOfJoining,double salary,String address)
    {
        this.employeeName = employeeName;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    // Method for printing Employee Details without salary
    void printEmployeeDetails(){
        System.out.println(this.employeeName+"\t\t"+this.yearOfJoining+"\t\t\t"+this.address);
    }

    // Method for printing Employee Details with salary
    void printEmployeeDetailsWithSalary(){
        System.out.println(this.employeeName+"\t\t"+this.yearOfJoining+"\t\t\t"+this.salary+"\t\t"+this.address);
    }

}
class Assignemnt4Que2 {
    public static void main(String[] args)
    {

        Employee E1 = new Employee("Robert",1994,90000,"64C- WallsStreat");
        Employee E2 = new Employee("Sam",2000,65000,"68D- WallsStreat");
        Employee E3 = new Employee("John",1999,70000,"26B- WallsStreat");

        Scanner input = new Scanner(System.in);

        System.out.println("do you want to see the salary printed ? (True/False)");
        boolean userOption = input.nextBoolean();

        input.close();

        // Printing details according to the question statement
        if(userOption){
            System.out.println("Name\t\t"+"Year of joining\t\t"+"Salary\t\t"+"Address");
            E1.printEmployeeDetailsWithSalary();
            E2.printEmployeeDetailsWithSalary();
            E3.printEmployeeDetailsWithSalary();
            
        }
        // Printing details accordingh to the example shown in the question
        else{
            System.out.println("Name\t\t"+"Year of joining\t\t"+"Address");
            E1.printEmployeeDetails();
            E2.printEmployeeDetails();
            E3.printEmployeeDetails();
        }
    }
}