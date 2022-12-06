//24. Consider an array of length n containing unique integers in random order and in the
//        range 1 to n + 1. For example, an array of length 5 would contain 5 unique integers
//        selected randomly from the integers 1 through 6. Thus, the array might contain 3 6 5 1 4.
//        Of the integers 1 through 6, notice that the 2 was not chosen and is not in the array.
//        Write Java code that finds the integer that does not appear in such an array. Your solution
//        should use O(n²) operations

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Question24 {

    public static void main(String[] args){
        Random rand = new Random(); //declare random object
        HashSet<Integer> uniqueIntsSet = new HashSet<>(); //hashSets cannot have duplicates
        int n = 5000000; //input
        int max = n + 1; //max is n + 1
        int min = 1; //minimium is 1
        //declare an array of integers of size n

        for (int i = 0; i < n; i++){ //iterate through the range (i,n) exclusive incrementally
            if(uniqueIntsSet.size() < n) { //if the size of uniqueIntsSet is
                uniqueIntsSet.add(rand.nextInt((max - min) + 1) + min); //set uniqueIntegers[i] to random number between max and min
                i--; //decrement i
            }
        }


        int x = 0; //declare temp variable w value of 0;
        int[] uniqueIntsArray = new int[uniqueIntsSet.size()]; //declare array with same size of the set
        for (int element: uniqueIntsSet){ //for each element in the set
            uniqueIntsArray[x++] = element; //populate the array with the value of the element.
        }
        System.out.println(Arrays.toString(uniqueIntsArray)); //print the array.


//      algo is loosely based off of the selection sort algorithm.
        int difference; //stores the difference
        for(int i = 0; i < n; i++){ //iterate through i < n
            for(int j = i + 1; j < n; j++){ //iterate through j < n
                difference = uniqueIntsArray[j] - uniqueIntsArray[i]; //initialize difference variable
                if(difference == 2) { //if difference is 2
                    System.out.println("Missing Element " + (uniqueIntsArray[i] + 1)); //print the missing element
                }
                i++;
            }
        }
        if (uniqueIntsArray[0] == 2){ //if the element at 0 is 2
            System.out.println("Missing element: " + min); //print min
        } else if (uniqueIntsArray[n-1] == n){ //if the element at n - 1 is n
            System.out.println("Missing element: " + max); //print the maximum
        }

    }
}
