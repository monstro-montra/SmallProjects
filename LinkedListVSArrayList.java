import java.util.ArrayList;
import java.util.LinkedList;
//this program serves as a benchmark to test the speed of array lists vs linked lists. array lists seem to be faster.

public class LinkedListVSArrayList {
    static ArrayList<Integer> arrayList = new ArrayList<>();
    static LinkedList<Integer> linkedList = new LinkedList<>();


    public static void main (String[] args){
        LinkedListVSArrayList run = new LinkedListVSArrayList();
        run.populate();
        detectTime(arrayList);
        detectTime(linkedList);
    }

    public void populate(){
        for(int i = 0; i < 10000; i ++){
            arrayList.add(i);
            linkedList.add(i);
        }
    }

    public static void detectTime(ArrayList<Integer> integers){
        final long startTime = System.nanoTime();
        integers.remove(532);
        final long endTime = System.nanoTime();
        final long totalTime = endTime - startTime;
        System.out.println("Total time taken for Array List: " + totalTime + " nanoseconds.");
    }

    public static void detectTime(LinkedList<Integer> integers){
        final long startTime = System.nanoTime();
        integers.remove(532);
        final long endTime = System.nanoTime();
        final long totalTime = endTime - startTime;
        System.out.println("Total time taken for Linked List: " + totalTime + " nanoseconds.");
    }
}
