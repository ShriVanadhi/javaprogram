public class GetInputUser {
     public static void main(String[] args){
         //create the scanner object
        Scanner input = new Scanner(System.in);
        //Comment to print the text 
        System.out.println("Enter a line of text");
        //wait for user to write a line
        String line = input.nextLine();
        //print the entered text
        System.out.println("You entered:" + line);
         }
    }
