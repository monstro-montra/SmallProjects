import java.util.Scanner;

    class ArrayTest {

        public static void main(String[] args){

            Scanner in = new Scanner(System.in); //creates user input called in

            int[] array; //creates an integer array called 'array'
            array = new int[5]; //the array will store 5 values.

            System.out.println("Input 5 numbers:"); //ask the user to input 5 numbers.

            array[0] = in.nextInt(); //assign first number to array[0]
            array[1] = in.nextInt(); //assign second number to array[1]
            array[2] = in.nextInt(); //assign third number to array[2]
            array[3] = in.nextInt(); //assign fourth number to array[3]
            array[4] = in.nextInt(); //assign fifth number to array[4]

            System.out.println("Your numbers are: "); 
            for (int element: array){ //prints out each 'element' of the array using a for loop.
                System.out.println(element);
            }

            System.out.println("Hello!");

            in.close();

        }
    }