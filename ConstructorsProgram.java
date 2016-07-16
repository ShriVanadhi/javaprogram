package javaapplication1;
class Machine{
    //constructor should have private instance variables & public methods
     private String name; 
     private int code;
     /*create Machine() constructor, i.e constructor must have the same class 
     *name and doesn't have return type 
     */
public Machine(){
    //goes to method has string value and integer
    this("Arnie",0);
    System.out.println("First constructor running!");
    }
public Machine(String name){
    System.out.println("Second constructor running!");
    this.name = name;
    System.out.println("Machine2 name is " + name);
}
public Machine(String name,int code){
    System.out.println("Third constructor running!");
    this.name = name;
    this.code = code;
    System.out.println("Machine3 name is " + name + " and code is " + code);
}
}


public class CostructorsProgram {
    public static void main(String[] args){
        // create machine1 object using machine class
        Machine machine1 = new Machine();
        //instance of class passes to constructor with string name
        Machine machine2 = new Machine("Bertie");
        //instance of class passes to constructor with string name and integer value
        Machine machine3 = new Machine("Chokey",6);
     }
    
}
