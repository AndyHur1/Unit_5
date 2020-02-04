public class Truck {
    private String truckID;
    private double odometer;
    private double mpg;
    private double fuel;
    private final double capacity = 20.0;
    public static double TotalFuel;

public String getTruckID(){

    return truckID;
}
public double getOdometer(){

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
public String drive(double miles){
    String drives = "";
    if (fuel*mpg>=miles){
        fuel-=(miles/mpg);
        odometer+=miles;
        drives="Success";
    }else{
        drives="Truck "+truckID+" does not have enough fuel to drive "+miles+" miles.";
    }
    return drives;
}
public void fill(){
    TotalFuel+=(capacity-fuel);
    fuel+=(capacity-fuel);

}
public String fill(double gal){
    String result = "";
    if (fuel+gal<=capacity){
        fuel+=gal;
        TotalFuel+=gal;
        result = "Success";
    }else {
        result = "Truck "+truckID+": Gallons exceeds tank capacity";
    }
    return result;

}
public static double getTotalFuel(){
    return TotalFuel;
}
public String toString(){
    return "Truck: "+truckID+"\n"+"Odometer: "+odometer+"\n"+"Miles Per Gallon: "+mpg+"\n"+"Fuel: "+fuel;
}

public void setMpg(double mpg){
    this.mpg=mpg;
}
public Truck(String truckID){
    this.truckID=truckID;
    this.odometer=0.0;
    this.mpg=0.0;
    this.fuel=0.0;
    TotalFuel+=this.fuel;

}
public Truck(String truckID,double odometer, double mpg, double fuel){
    this.truckID=truckID;
    this.odometer=odometer;
    this.mpg=mpg;
    this.fuel=fuel;
}

}
