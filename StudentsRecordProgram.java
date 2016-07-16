package javaapplication1;
class Student{
    //Declaring instance variables name and age
    String name;
    int age;
}

public class StudentsRecordProgram {
    public static void main(String[] args){
        //Using Student class to create stud1 object
        //new is used to create an instance of class
        Student stud1 = new Student();
        //Intializing stud1's name variable
        stud1.name = "Latha";
        //Intializing stud1's age variable
        stud1.age = 15;
        
        Student stud2 = new Student();
        stud2.name = "Sita";
        stud2.age = 15;
       //Comment to print stud1's name and age
       System.out.println(stud1.name + "'s age =" + stud1.age);
       //Comment to print stud2's name and age
       System.out.println(stud2.name + "'s age =" + stud2.age);
    }
    
}
