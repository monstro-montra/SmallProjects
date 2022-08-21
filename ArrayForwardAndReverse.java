import java.util.Scanner;

public class ArrayForwardAndReverse {
   public static void main (String [] args) {
      Scanner in = new Scanner(System.in);
      final int NUM_VALS = 4;
      int [] courseGrades = new int[NUM_VALS];
      int i;

      System.out.println("Enter four integers: ");
      for (i = 0; i < courseGrades.length; ++i) {
         courseGrades[i] = in.nextInt();
      }

      
      for (i = 0; i < courseGrades.length; i++){
         System.out.print(courseGrades[i] + " ");
         }
         
      System.out.println("");
      
      for (i = courseGrades.length -1; i >= 0; i--){
         System.out.print(courseGrades[i] + " ");
         }
         
      System.out.println("");
         

   }
}