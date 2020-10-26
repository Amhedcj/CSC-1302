/**
   This class solves the eight queens problem using backtranking.
*/
public class EightQueens{
   public static void main(String[] args){
      solve(new PartialSolution(0));
   }
   
   /**
      Prints all solutions to the problem tha can be exteded from
      a given partial solution
      @param sol the partial solution
   */
   public static void solve(PartialSolution sol){
      int exam = sol.examine();
      if (exam == PartialSolution.ACCEPT){
         System.out.println(sol);
      }
      else if (exam == PartialSolution.CONTINUE){
         for (PartialSolution p : sol.extend()){
            solve(p);
         }
      }
   }
}