package javaapplication1;

class Employee{
String name;
int age;
//create return value method
int calculateYearsToRetirement(){
    //calculates years left for retirement
    int yearsLeft = 65 - age;
    //returns years left value
    return yearsLeft;
}
String getName(){
    return name;
}

int getAge(){
    return age;
}
}
public class ReturnValueProgram {
    public static void main(String[] args){
    Employee employee1 = new Employee();
    employee1.name = "Geetha";
    employee1.age = 25;
    //years has the return value of calculateYearsToRetirement() method
    int years = employee1.calculateYearsToRetirement();
    //comment to print the Years Left for retirement
    System.out.println("Years Left for retirement is " + years);
    String employeeName = employee1.getName();
    System.out.println("My name is " + employeeName);
    int employeeAge = employee1.getAge();
    System.out.println("My Age is " + employeeAge);
    }
    
}
