public class ShapeCalculator {
    public static double calculatePerimeter(double length, double width){
     return 2 * (length + width);
}  
   public static void main(String[] args) {
    double calculatePerimeter = calculatePerimeter(5.0, 3.0);
    System.err.println(calculatePerimeter);
   } 
}
