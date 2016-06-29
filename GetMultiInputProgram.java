import java.util.Scanner;

public class GetMultiInputProgram {
    public static void main(String[] args){
        //intializing the int variable with 0
        int num = 0;
        //Create Scanner Object
        Scanner scanner = new Scanner(System.in);   
         do{
             // Comment to print the number
           System.out.println("Enter the number");
           //wait till user enters the integer
           num = scanner.nextInt();
        }
         //loop executes until the user enters number 5
        while(num != 5);
         //Comment to show that got number 5
        System.out.println("Got 5!");
      }
}
