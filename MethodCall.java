import java.util.Scanner;

public class MethodCall {

    public static double average(double a, double b, double c, double d) // create new method to calculate average
    {
        double avg = (a + b + c + d) / 4; //add all of the paramaters together and divide by # of parameters
        return avg; // return the average
    } 

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Hi! We are going to calculate the average between four numbers. ");

        System.out.print("Please input the first number: ");
        double a = in.nextDouble(); //scan next double
        System.out.print("Please input the second number: ");
        double b = in.nextDouble(); //scan next double
        System.out.print("Please input the third number: ");
        double c = in.nextDouble(); // scan next double
        System.out.print("Please input the fourth number: ");
        double d = in.nextDouble(); // scan next double


        System.out.println("You chose: \n" + a + "\n" + b + "\n" + c + "\n" + d);

        System.out.println("The average is: " + average(a, b, c, d)); // call the average method to calculate the average
        
        in.close(); //close to prevent resource leak


    }
    
}
