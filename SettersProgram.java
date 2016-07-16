package javaapplication1;

class Frog{
    /**
     * Using Encapsulation here
     * private access modifier is used to hide variable in other classes 
     * other methods should be in public 
     */
    private String name;
    private int age;
    //set the passed string value to name 
    public void setName(String name){
        //this.name i.e name refers instance variable
        //name refers local variable
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        //returns string value name
        return name;
    }
    public int getAge(){
        //returns integer value age
        return age;
    }
}


public class SettersProgram {
    public static void main(String[] args){
        //Create frog1 object using Frog class 
        Frog frog1 = new Frog();
        //passing string parameter to setName method
        frog1.setName("Kermit");
        //passing int parameter to setAge method
        frog1.setAge(2);
        //get and print the string value name
        System.out.println(frog1.getName());
        //get and print the integer value age
        System.out.println(frog1.getAge());
        
    }
    
}
