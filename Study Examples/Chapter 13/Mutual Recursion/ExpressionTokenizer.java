/**
   This class braks up a string describing an expression
   into tokens: nublers, parentheses, and perators.
*/
public class ExpressionTokenizer{
   private String input;
   private int start; // The start of the current token
   private int end;// teh position after the end of the current token
   /**
      Constructs a tokenizer
      @param anInput the string to tokenizer
   */
   public ExpressionTokenizer(String anInput){
      input = anInput;
      start = 0;
      end = 0;
      nextToken(); // Find the first token
   }
   
   /**
      Peeks at the next token without consuking it.
      @return the next token or null it there are no more tokens
   */
   public String peekToken(){
      if (start >= input.length()){
         return null;
      }
      else{
         return input.substring(start, end);
      }   
   }
   /**
       Gets the next tokenand move the tokenizer tho the folloving token.
       @return the next token or null if there are no more tokens

   */
   public String nextToken(){
      String r = peekToken();
      start = end;
      if (start >= input.length()){
         return r;
      }
      if (Character.isDigit(input.charAt(start))){
         end = start + 1;
         while (end < input.length() && Character.isDigit(input.charAt(end))){
            end++;
         }
      }
      else{
         end = start + 1;
      }
      return r;
   } 
}
