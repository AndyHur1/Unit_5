public class Item {

    private String part_number;
    private String part_description;
    private double part_price;
    public String toString(){

        return "Item: "+this.part_number+"\nPrice: "+this.part_price+"\nDescription: "+this.part_description;
    }

    Item(String part_number, String part_description, double part_price){
        if (part_price<=0){
            part_price=0;

        }

        this.part_number=part_number;
        this.part_description=part_description;
        this.part_price=part_price;
    }
    public double getTotalPrice(int value){
        return part_price*value;
    }
}
