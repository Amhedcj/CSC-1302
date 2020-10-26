import java.util.Arrays;
/**
   This program demostrates the merge sort algorithm by
   sorting an array that is filled with random numbers.
*/
public class MergeSortDemo{
   public static void main(String[] args){
      //int[] a = ArrayUtil.randomIntArray(20, 100);
      int[] a = new int[]{1,4,2,6,38,9,10};
      System.out.println(Arrays.toString(a));
      
      MergeSorter.sort(a);
      
     System.out.println(Arrays.toString(a));  
   }
}