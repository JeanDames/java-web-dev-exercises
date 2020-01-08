package exercises;
import java.util.Scanner; //import Scanner class

public class HelloWorld {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //declare input variable
        System.out.println("Hello, what is your name: "); //message to CLI for user input
        String name = input.nextLine(); //Store user input
        input.close();

        System.out.println("Hello " + name);

    }

}
