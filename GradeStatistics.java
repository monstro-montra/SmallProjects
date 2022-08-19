import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException; 

public class GradeStatistics {
    public static void main(String[] args){

        /*this program provides stats for the grades in a class
         *it will a ask the user to input 10 floating point grades using the scanner
         *and store the value into an array. the program then
         *takes those values and calculates the average, maximum, and minimum
         *and prints it out to the user
        */

        float Average; 
        float Maximum;
        float Minimum;
        float[] grades = new float[11]; //set to 11 to avoid index error
        int size = grades.length; // setting size of grades[] to an int named size
        Scanner in = new Scanner(System.in); // scanner

        System.out.println("Input ten grades: ");
        
        while(true){ //

            try{ //try the following for loop
                for (int i = 1; i < size; i++ ){ //i is the index. i is always at least 1 an will be less than size of array. 
                    grades[i] = in.nextFloat(); // will start with grades[1] and store the value as it increments by 1. once i >= size , for loop breaks
                } 
                break; //break out of while loop
            } catch(InputMismatchException e) { //if wrong input, follow next block of code and repeat the while loop
                System.out.println("Wrong input. Please retry and input ten grades in the form of a number.");
                in.nextLine();
            }

        }


        System.out.print(grades[1] + ", ");
        System.out.print(grades[2] + ", ");
        System.out.print(grades[3] + ", ");
        System.out.print(grades[4] + ", ");
        System.out.print(grades[5] + ", ");
        System.out.print(grades[6] + ", ");
        System.out.print(grades[7] + ", ");
        System.out.print(grades[8] + ", ");
        System.out.print(grades[9] + ", ");
        System.out.println (grades[10]);

        Arrays.sort(grades); // sort array from lowes to highest
        Average = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4] + grades[5] + grades[6] + grades[7] + grades[8] + grades[9] + grades[10]) / 10;
        Maximum = grades[size - 1]; // max array size = 11, highest is last so size -1
        Minimum = grades[size - 10]; // max array size = 11, lowest is first so size -11 to get grades[0]

        System.out.println("Maximum is: " + Maximum);
        System.out.println("Minimum is: " + Minimum);
        System.out.println("Average is: " + Average);
        in.close(); //close scanner to avoid resource leak
        }

        
    }

        

    

