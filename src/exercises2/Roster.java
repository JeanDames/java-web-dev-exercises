package exercises2;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Roster {
    public static void main(String[] args) {

        HashMap<Integer, String> classRoster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newRoster;

        System.out.println("Please enter the student's name. Press ENTER when done.");
        do {
            System.out.print("Student: ");
            newRoster = input.nextLine();

            if(!newRoster.equals("")){
                System.out.print("ID Number: ");
                Integer id = input.nextInt();
                classRoster.put(id, newRoster);

                input.nextLine();
            }
        } while(!newRoster.equals(""));

        System.out.println("Class Roster: ");
        for(Map.Entry<Integer, String> student: classRoster.entrySet()) {
            System.out.println(student.getValue() + ", " + student.getKey());
        }
    }
}
