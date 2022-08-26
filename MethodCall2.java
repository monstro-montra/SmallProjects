/*
Write a program with a method that will accept as input a scanner object. 
Prompt the user for three individual string input values (e.g., Red, Blue, and Green). 
Use Try..Catch error handling. The method should print the contents of the user input and 
return a string value to the calling method indicating "Success" or "Failure" based on the 
program flow through the try..catch error handling (see Chapter 6 in the text). Print the return 
message. Call the method from the main program to demonstrate its functionality.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodCall2 {

    public static String input(String s){
        Scanner in = new Scanner(System.in);

        String a;
        String b;
        String c;

        System.out.println("Input three strings.");
        while(true){
            try{
                a = in.next();
                b = in.next();
                c = in.next();
                System.out.println("Your inputs are " + a + " " + b + " and " + c);
                return "Success";
            }
            catch (InputMismatchException ex) {
                System.out.println("You entered incorrect data. Please retry.");
                return "Failure";
            }
        }

    }
    public static void main(String[] args){
        String s = input("Test");
        System.out.println(s);
        
    }

    
}
