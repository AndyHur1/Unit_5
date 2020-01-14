import java.util.Scanner;

public class SquareDriver {

    public static void main(String[]args){
        Scanner user_input = new Scanner(System.in);
        System.out.println("Please enter the length of the square.");
        int x = user_input.nextInt();
        Square length = new Square(x);

        System.out.println(" "+length);
        System.out.println(length.calculatedArea());

    }
}
