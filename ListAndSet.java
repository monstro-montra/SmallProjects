import java.io.*;
import java.util.*;
public class ListAndSet {
    public static void main(String[] args){

        //declare set
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Hello");
        stringSet.add("World!");
        stringSet.add("This");
        stringSet.add("is");
        stringSet.add("a program.");
        stringSet.add("Hello"); //won't print because the set won't allow duplicate elements

        //declare list
        List<Integer> intList = new ArrayList<>();
        intList.add(9);
        intList.add(2);
        intList.add(1);
        intList.add(6);
        intList.add(9);

        System.out.println("Set: " + stringSet);

        System.out.println("List: " + intList);
    }

}
