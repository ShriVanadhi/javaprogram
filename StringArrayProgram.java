package javaapplication1;

public class StringArrayProgram { 
    public static void main(String[] args){
        //intializing the word length as 3
        String[] words = new String[3];
        
        words[0] = "Hello";
        words[1] = "Guru";
        words[2] = "Sabarish";
        //print the three words using concatenation
       System.out.println(words[0]+ " " + words[1] + " " + words [2]);
       //intializing the array variable fruits with 4 fruits
       String[] fruits = {"apple","mango","grapes","pineapple"};
       //print the fruit names using for loop
       for(String fruit: fruits){
           System.out.println(fruit);
       }
       String text = null;
       
       System.out.println(text);
       
       String[] numbers = new String[2];
      //print the string number[0] without intializing
       System.out.println(numbers[0]);
       numbers[0] = "one";
       System.out.println(numbers[0]);
    }   
    
}
