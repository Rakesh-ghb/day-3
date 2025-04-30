public class TemperatureConverter {
    public static double convertToFahrenheit(double celsius){
return((celsius*9/5)+32);
    }
    public static void main(String[] args) {
        double convertTOFahrenheit=convertToFahrenheit(25);
        System.out.println(convertTOFahrenheit);
    }
    
}
