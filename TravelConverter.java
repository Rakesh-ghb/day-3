public class TravelConverter{
    public static double kmToMiles(double km){
        return km*0.621371;
    }
    public static void main(String[] args) {
        double kmToMilesresult = kmToMiles(10);
        System.out.println(kmToMilesresult);
    }
    
}
