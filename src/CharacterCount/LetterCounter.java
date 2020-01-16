package CharacterCount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to count: ");
        String userString = input.nextLine();


        char[] userCharArray = userString.toCharArray();
        HashMap<Character, Integer> counter = new HashMap<>();
        for(char letter: userCharArray) {
            letter = Character.toLowerCase(letter);
            boolean actualLetter = Character.isLetter(letter);
            if(!actualLetter){
                continue;
            }else if(!counter.containsKey(letter)) {
                counter.put(letter, 1);
            } else {
                int value = counter.get(letter);
                counter.replace(letter, value, value + 1);
            }
        }
        for(Map.Entry<Character, Integer> entry: counter.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
