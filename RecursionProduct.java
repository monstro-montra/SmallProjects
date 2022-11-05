import java.util.ArrayList; //import ArrayList
import java.util.InputMismatchException;
import java.util.Scanner; //import scanner
public class RecursionProduct {
    //fields
    private final ArrayList<Float> numbers = new ArrayList<>(); //create arraylist of floats

    //main method
    public static void main(String[] args){
        RecursionProduct recursionProduct = new RecursionProduct(); //will allow the calling of non-static methods
        recursionProduct.scanArray(0); //set the starting method call count to 0 for scanArray
        recursionProduct.printArray(0);//set the starting method call count to 0 for printArray
        //print the product by calling arrayProduct with a starting count of 0.
        System.out.println("The product is: " + recursionProduct.arrayProduct(0));

    }

    //recursive method for scanning/adding to the numbers arraylist
    private void scanArray(int count){
        Scanner in = new Scanner(System.in); //create new scanner object called in
        System.out.println("Input a number: ");

        while(true){//start a while loop
            try{ //try the following code block for exception logic
                numbers.add(in.nextFloat());
                break;
            } catch (InputMismatchException e){
                System.out.println("Wrong input. Please put in a number."); //exception logic
                in.nextLine(); //scan next line
                // scanner waits for next user input.
            }
        }

        if(count == 4){ // once the count reaches 4, it will have iterated through 5 elements in the array.
            System.out.println("Finished scanning!");
            //automatically returns since method is void
        } else { //otherwise
            scanArray(count + 1); //run the method again and add 1 to count
        }
    }

    //recursive method for printing the arraylist
    private void printArray(int count){
        System.out.println("Index " + count + ": " + numbers.get(count));
        if (count == 4){ // once the count reaches 4, it will have iterated through 5 elements in the array.
            System.out.println("Finished printing!");
            //automatically returns since method is void.
        }
        else{
            printArray(count + 1);
        }
    }
    //recursive method to find the product of all numbers in the arraylist
    public float arrayProduct(int count){
        if (count == numbers.size()){ // if the count is equal to the size of numbers arraylist. base case
            return 1; // return from the method.
        }
        else{
            return numbers.get(count) * arrayProduct(count + 1);
            //return the (count) element of numbers arraylist
            //times arrayProduct(next element of numbers arrayList)
        }

    }

}
