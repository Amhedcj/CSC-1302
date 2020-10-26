import java.util.Arrays;
/**
   this program demonstrates the selectionsort algorithm by
   sorting an array that is filled with random numbers.
*/
public class SelectionSortDemo{
   public static void main(String[] args){
      int[] a = ArrayUtil.randomIntArray(20, 100);
      System.out.println(Arrays.toString(a)); 
      
      SelectionSorter.sort(a);
      
      System.out.println(Arrays.toString(a));
   }
}