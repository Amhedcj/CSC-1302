/**
   A triangular shape composed of stacked units squares like this:
   []
   [][]
   [][][]
*/
public class Triangle{
   public int width;
   
   /**
      Costruct a triangular shape.
      @param aWidth the width (and height) od the triangle.
   */
   public Triangle(int aWidth){
      width = aWidth;
   }
   /**
      Computes the area od the triangle.
      @return the area.
   */
   public int getArea(){
      if (width <= 0){
         return 0;
      }
      else if (width == 1){
         return 1;
      }
      else{
         Triangle smallerTriangle = new Triangle(width - 1);
         int smallerArea = smallerTriangle.getArea();
         return smallerArea + width;
      }
   }
}
