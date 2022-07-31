import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.*;

    class MPGCalculator {


        public static void main(String[] args){

            int carYear; //year of the car
            String carBrand; //car brand
            String carModel; //model of the car
            double startingOdometer; //the starting odometer reading
            double gallonsUsed; //how many gallons were used
            Scanner in = new Scanner(System.in);

            System.out.println("Hi! We are going to calculate your Miles per Gallon.");

            while(true) { //create a while loop
                System.out.print("Input your car's year: "); //ask user to input 
                try{//try block. exceptions errors can occur here.
                    carYear = in.nextInt(); //check for an integer
                    break; //break out of the while loop here
                }catch(InputMismatchException e){ // catches the try block exception error
                    System.out.println("Please input an integer"); //ask user to input an integer.
                    in.nextLine(); // scanner waits for next user input.
                }
            }
            
            while(true) { //create a while loop
                System.out.print("Input your car's brand: "); //ask user to input 
                try{//try block. exceptions errors can occur here.
                    carBrand = in.next(); //check for string
                    carBrand.replaceAll("\\d+", "");
                    break; //break out of the while loop here
                }catch(InputMismatchException e){ // catches the try block exception error
                    System.out.println("Please input a string"); //ask user to input an integer.
                    in.nextLine(); // scanner waits for next user input.
                }
            }
            

            System.out.print("Input your car's model: ");

            carModel = in.next();

            System.out.print("Input your car's starting odometer reading: ");

            startingOdometer = in.nextDouble();

            System.out.print("Input how many gallons were used in your car: ");

            gallonsUsed = in.nextDouble();

            in.close();

            System.out.println("");




        }
    }