package exercises2;

import java.util.ArrayList;

public class Evens {

    public static int sumEven(ArrayList<Integer> arr) {

        int sum = 0;
        int num;
        for (int i=0; i<arr.size(); i++) {
            num = arr.get(i);
            if(num%2 ==0) {
                sum += num;
            }
        }
        return sum;
    }
}
