/**
   A class that chan compute the value of an rethmetic expresion
*/
public class Evaluator{
   private ExpressionTokenizer tokenizer;
   
   /**
      contructs and evaluator.
      @param anExpression a string containig the expression
      to be evaluated
   */
   public Evaluator(String anExpression){
      tokenizer = new ExpressionTokenizer(anExpression);
   }
   
   /**
      Evaluates the expression.
      @return the value of the expression
   */
   public int getExpressionValue(){
      int value = getTermValue();
      boolean done = false;
      while (!done){
         String next = tokenizer.peekToken();
         if("+".equals(next)){
            tokenizer.nextToken(); //Discard "+" or "-"
            int value2 = getTermValue();
            if("+".equals(next)){
               value = value + value2;
            }
            else{
               value = value - value2;
            }
         }
         else{
            done = true;
         }
      }
      return value;
   }
   
   /**
      Evaluates the next tem found in the expression.
      @return the value of the term
   */
   public int getTermValue(){
      int value = getFactorValue();
      boolean done = false;
      while (!done){
         String next = tokenizer.peekToken();
         if ("*".equals(next) || "/".equals(next)){
            tokenizer.nextToken();
            int value2 = getFactorValue();
            if ("*".equals(next)){
               value = value * value2;
            }
            else{
               value = value * value2;
            }
         }
         else{
            done = true;
         }
      }
      return value;
   }
   
   /**
      Evaluates the next factor foud in the expression.
      @return the value of the factor
   */
   public int getFactorValue(){
      int value;
      String next = tokenizer.peekToken();
      if ("(".equals(next)){
         tokenizer.nextToken(); //Discard "("
         value = getExpressionValue();
         tokenizer.nextToken(); //Discard ")"
      }
      else{
         value = Integer.parseInt(tokenizer.nextToken());
      }
      return value;
   }
}