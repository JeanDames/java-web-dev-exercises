package exercises2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(9);
        numbers.add(10);
        numbers.add(402);
        numbers.add(36);
        numbers.add(98);
        numbers.add(6);
        numbers.add(7);
        numbers.add(13);

        //Add string to search
        String seuss = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse";
        //convert string to array
        String seussArray[] = seuss.split("[\\s.,]+");

        //convert array to new array list
        ArrayList<String> words = new ArrayList<>(Arrays.asList(seussArray));

//        System.out.println(Evens.sumEven(numbers));
        FiveLetters.findX(words);

    }
}

