public class BillCalculator{
  public static double calculateTotalWithTax(double amount, double
    taxPercent){
    return amount + (amount * taxPercent / 100);
    }
public static void main(String[] args) {
    double calculateTotalWithTax = calculateTotalWithTax(100,18);
    System.out.println(calculateTotalWithTax);

}
    
}
