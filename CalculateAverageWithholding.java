import java.util.Scanner;
import java.util.InputMismatchException; 

    class CalculateAverageWithholding {

        public static void main(String[] args){
            
            float income;
            float taxRate;
            float taxAmount;
            float takeHome;
            Scanner in = new Scanner(System.in);

            System.out.println("Hi! We're going to caluclate your average weekly average withholding.");
            System.out.println("Please input your weekly income.");

            while (true){ //create while loop
                try{ //try block
                    income = in.nextFloat(); //set income to scanner's next float input
                    break; //break out of loop
                } catch(InputMismatchException e) { // catch input mismatch exception error
                    System.out.println("Wrong input. Please input an integer or decimal."); //asks user to input a float instead
                    in.nextLine(); //scanner scans for nextLine
                }
            }

            in.close(); // close the scanner to prevent resource leak
            
            System.out.println("Your current income is: " + income + "$"); //print back the user's income

            //i would use a switch for readability, but since it's a float, I'll be using if/else statements
            //switch doesn't take float, boolean, or doubles.

            if(income < 500 && income > 0){ // if the income is less than 500 and greater than 0
                taxRate = 10; //taxRate is 10
                
            } else if (income >= 500 && income < 1500){ //if income is >= 500 and income is < 1500
                taxRate = 15; //taxRate is 15

            } else if (income >= 1500 && income < 2500 ){ //if income is >= 1500 and income is < 2500
                taxRate = 20; //taxRate is 20

            } else if (income >= 2500){ //if income is >= 2500 
                taxRate = 30; //taxRate is 30

            } else { //otherwise 
                taxRate = 0; //taxRate is 0
            }

            System.out.println("Your tax rate is: " + taxRate + "%"); //prints out tax rate in percentage form
            
            taxRate = taxRate / 100; //set the taxRate into a decimal by diving by 100
            taxAmount = income * taxRate; //set taxAmount to income times taxRate
            takeHome = income - taxAmount; //set takeHome to income minus taxAmount
            
            System.out.println("The amount taxed is: " + taxAmount + "$"); // print taxAmount
            System.out.println("Your take home for this week is: " + takeHome + "$"); //print takeHome
            
        }
            
    }