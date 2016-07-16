package javaapplication1;
class Athlete{
    //creating speak method with string parameter
    void speak(String text){
        //print the passed string parameter
        System.out.println(text);
    }
    //creating jump method with int parameter
    void jump(int height){
        //print the passed int parameter
        System.out.println("Jump: " + height);
    }
    //creating move methpd with string and double parameters
    void move(String direction,double distance){
        //print the passed string,double parameters
        System.out.println("Moving " + distance + " meters in direction " + direction);
    }
    
}


public class PassingParameterToMethod {
    public static void main(String[] args){
        //create sindhu method with Athlete class
        Athlete sindhu = new Athlete();
        //passing string parameter to speak method
        sindhu.speak("Hi, I am Sindhu");
        //passing int parameter to jump method
        sindhu.jump(7);
        //passing string, double parameters to move method
        sindhu.move("east", 2.5);
        //creating a label using greeting string variable
        String greeting = "Hello there";
        //passing greeting label to speak method
        sindhu.speak(greeting);
        sindhu.jump(6);
        }
    }
