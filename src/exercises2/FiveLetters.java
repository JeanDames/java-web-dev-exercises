package exercises2;

import java.util.ArrayList;
import java.util.Scanner;

public class FiveLetters {
    public static ArrayList<String> findX(ArrayList<String> str) {

        ArrayList<String> xLetterWords = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of words to find: ");
        int length = input.nextInt();
        for(String word: str) {
            if(word.length() == length) {
                xLetterWords.add(word);
                System.out.println(word);
            }
        }
        if(xLetterWords.size() == 0){
            System.out.println("No words with that length found");
        }
        return xLetterWords;
    } 
}
