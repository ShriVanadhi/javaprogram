package javaapplication1;

class Thing{
    //Intializing final static variable LUCKY_NUMBER is 7
    public final static int LUCKY_NUMBER = 7;   
    //Declaring string instance variable
    public String name;
    //Declaring static string variable
    public static String description;  
    //Declaring static int variable
    public static int count = 0;
    //Declaring int variable
    public int id;
    
    public Thing(){
        //assigning count value to id
        id = count;
        //count increments while class instance creates 
        count++;
    }
    
    public static void showInfo(){
        System.out.println(description);
       /*System.out.println(name);
        *This line doesn't execute because static method doesnt accept instance variable
        */
    }
    public void showName(){
        System.out.println("object id =" + id + "," + description+ ":" + " " + name);
    }
   
}

public class StaticFinalProgram {
    public static void main(String[] args){
            
       //static variable can be accessed using class name
        Thing.description = "I am a thing";
        //calling showInfo method
        Thing.showInfo();
        
        System.out.println("Before object creations, count is: " + Thing.count);
        //create thing1 object using Thing class
        Thing thing1 = new Thing();
        //create thing2 object using Thing class
        Thing thing2 = new Thing();
        System.out.println("After object creations, count is: " + Thing.count);
        
        //assigning string Bob to instance variable name using thing1 object
        thing1.name = "Bob";
        //calling showName() method using thing1 object
        thing1.showName();
        //assigning string Sue to instance variable name using thing2 object
        thing2.name = "Sue";
        //calling showName() method using thing2 object
        thing2.showName();
        //print library final static variable PI
        System.out.println(Math.PI);
        //print final static variable LUCKY_NUMBER
        System.out.println(Thing.LUCKY_NUMBER);
       
        
    }
    
    
}
