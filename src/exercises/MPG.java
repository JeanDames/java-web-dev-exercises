package exercises;
import java.util.Scanner;

public class MPG {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles driven: ");
        double miles = input.nextDouble();
        System.out.println("How many gallons of gas used: ");
        double gas = input.nextDouble();
        input.close();

        double mpg = miles / gas;
        System.out.println("You got " + mpg + " miles per gallon");

    }

}
