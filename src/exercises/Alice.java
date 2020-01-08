package exercises;
import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        String paragraph = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your search term: ");
        String find = input.next();
        boolean found = paragraph.toLowerCase().contains(find.toLowerCase());
        input.close();

        if(found) {
            System.out.println(find + " is at index " + paragraph.toLowerCase().indexOf(find) + " and is " + find.length() + " characters long");
            String newPar = paragraph.toLowerCase().replaceAll(find, "");
            System.out.println(newPar);
        } else {
            System.out.println("search term not found.");
        }
    }
}
