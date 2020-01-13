public class Square {

    private double side;

    public String toString() {
        return "Sqaure with this side"+ side;
    }
    public Square(double side){

        this.side=side;
    }

    public Square() {
        this.side=2;
    }

    public double calculatedArea() {
        return this.side*this.side;
    }

}
