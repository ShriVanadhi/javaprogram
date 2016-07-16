package javaapplication1;

class Person{
    //Declaring instance variables name and age
    String name;
    int age;
    
    void speak(){
        System.out.println("My name is " + name + " and I am " + age + " years old");
        }
}
public class CallMethodProgram {
    public static void main(String[] args){
        //Create a Person object using the person class
        Person person1 = new Person();
        //Intializing person1's name variable
        person1.name = "Latha";
        //Intializing person1's age variable
        person1.age = 15;
        //Calling speak() method using person1 object to print the person1's name and age
        person1.speak();
        
        Person person2 = new Person();
        //Intializing person2's name variable
        person2.name = "Sita";
        //Intializing person2's age variable
        person2.age = 18;
        //Calling speak() method using person2 object to print the person2's name and age
        person2.speak();
  
    }
    
    
}
