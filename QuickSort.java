import java.util.Random;

public class QuickSort {

    public static void main(String[] args){

        Random rand = new Random(); //new random object
        int[] nums = new int[10]; //array of size 10

        for (int i = 0; i < nums.length; i++){
            nums[i] = rand.nextInt(1000); //set nums[i] = to a random integer up to 100
        }

        System.out.println("Numbers before sort");
        printArray(nums);
        System.out.println("\n");
        System.out.println("After sort");

        quickSort(nums);

        printArray(nums);

    }

    private static void quickSort(int[] array){ //Overloaded method to be able to pass in only the array
        quickSort(array, 0, array.length -1);
    }
    public static void quickSort(int[] array, int lowIndex, int highIndex){
        if (lowIndex >= highIndex){ //checks to see if the subarray is just one element
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex; //random index somewhere between lowIndex and high
        int pivot = array[pivotIndex]; //set the pivot point to the array at highest index.
        swap(array, pivotIndex, highIndex); //swap random index with high index

        int leftPointer = partition(array, lowIndex, highIndex, pivot); //perform the partition step of quicksort

        quickSort(array, lowIndex, leftPointer -1); //run quicksort recursively for left side partition
        quickSort(array, leftPointer + 1, highIndex); //run quicksort recursively for right side partition

    }

    private static int partition(int[] array, int low, int high, int pivot){
        int leftPointer = low;
        int rightPointer = high;

        //these while loops will move the left and right pointers closer and closer until they meet.
        while (leftPointer < rightPointer){
            while(array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }

            while(array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            //swap elements that are at the leftPointer and rightPointer
            swap(array, leftPointer, rightPointer);
        }

        //once leftPointer and rightPointer meet (leftPointer == rightPointer), swap leftPointer and pivot.
        swap(array, leftPointer, high);
        return leftPointer;
    }

    private static void swap(int[] array, int i1, int i2){
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
 }
