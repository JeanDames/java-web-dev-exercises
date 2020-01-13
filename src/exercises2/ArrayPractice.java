package exercises2;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 5, 8};
        for(int i: arr) {
            if(i%2 != 0) {
                System.out.println(i);
            }
        }

        String seuss = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse";

        String splitSeuss[] = seuss.split("\\.");
        System.out.println(Arrays.toString(splitSeuss));
    }

}
