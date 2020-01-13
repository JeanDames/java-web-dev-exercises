package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double doubleTest;
        System.out.println("What is the radius of the circle?: ");
        String tester = input.nextLine();

        try {
            doubleTest = Double.parseDouble(tester);
            return;
        } catch (NumberFormatException e) {

        }
        double radius = input.nextDouble();
        input.close();

        System.out.printf("The area of the circle is: %s%n", Circle.getArea(radius));
    }
}
