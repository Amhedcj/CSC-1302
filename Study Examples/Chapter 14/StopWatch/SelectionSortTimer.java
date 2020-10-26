import java.util.Scanner;
/**
   This progam measures haw long it takes to sort an
   array of a user-specified size with the selection
   sort algorithm.
*/
public class SelectionSortTimer{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.print("Enter array size: ");
      int n = in.nextInt();
      
      //Construct ramdom array
      
      int[] a = ArrayUtil.randomIntArray(n, 100); // No se cual es el problema
      
      // Use stopwatch to time selection sort
      
      StopWatch time = new StopWatch();
      
      time.start();
      SelectionSorter.sort(a);// No se cual es el problema
      time.stop();
      
      System.out.println("Elapsed time: " 
            + time.getElapsedTime() + " milliseconds");
   }
}