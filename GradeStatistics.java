import java.util.Scanner;
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
        float[] grades = new float[10]; 
        Scanner in = new Scanner(System.in);

        System.out.println("Input ten grades: ");
        
        while(true){
            try{
                for (int i = 0; i < grades.length; i++ ){ //create for loop. if i is < length of grades[], increment by 1
                    grades[i] = in.nextFloat(); //set the array[i] = to the user input float. array only carries 10 numbers
                }
                break;
            } catch(InputMismatchException e) {
                System.out.println("Wrong input. Please input a number.");
                in.nextLine();
            }
            
            }


        System.out.println(grades[0]);
        System.out.println(grades[1]);
        System.out.println(grades[2]);
        System.out.println(grades[3]);
        System.out.println(grades[4]);
        System.out.println(grades[5]);
        System.out.println(grades[7]);
        System.out.println(grades[8]);
        System.out.println(grades[9]);
        System.out.println(grades[10]);
        }
    }

        

    

