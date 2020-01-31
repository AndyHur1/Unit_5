public class TruckAndTruckTest {
    private String truckID;
    private int odometer;
    private double mpg;
    private double fuel;
    private final double capacity = 20.0;
    public static double totalFuel;

public String getTruckID(){

    return truckID;
}
public int getOdometer(){

    return odometer;
}
public double getMpg(){
    return mpg;
}
public double getFuel(){
    return fuel;
}
public boolean enoughFuel(){
    boolean enough = false;
    if (fuel*mpg<odometer){
        enough=false;
    }else if (fuel*mpg>=odometer){
        enough=false;
    }
return enough;
}
public String drive(){
    String drives = "";
    if (fuel*mpg>=odometer){
        fuel=fuel-(odometer/mpg);
        drives="Success";
    }else{
        drives="Error";
    }
    return drives;
}
public void fill(){
    fuel+=(odometer-mpg*fuel)/mpg;
}
public String fill(double gal){
    String result = "";
    if (fuel<=capacity){
        result = "Success";
    }else {
        result = "Error";
    }
    return result;

}

}
