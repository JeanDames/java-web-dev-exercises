package exercises.technology;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SmartPhone extends Computer {

    private ArrayList<String> apps = new ArrayList<>();
    private HashMap<String, String> contacts = new HashMap<>();
    private String cellularProvider;

    public SmartPhone(double aAvailableStorage, String aOperatingSystem, String aOwner, String aCellularProvider) {
        super(aAvailableStorage, aOperatingSystem, aOwner);
        this.cellularProvider = aCellularProvider;
    }

    public String getCellularProvider() {
        return cellularProvider;
    }

    public void setCellularProvider(String newProvider) {
        cellularProvider = newProvider;
    }

    public void setContacts(String name, String number){
        this.contacts.put(name, number);
    }

    public String listContacts() {
        String allContacts = "All contacts:\n";
        for(Map.Entry<String, String> entry : contacts.entrySet()) {
            allContacts += entry.getKey() + " : " + entry.getValue() + "\n";
        }
        return allContacts;
    }

    public String findContact(String search) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Search contacts for: ");
//        String search = input.nextLine().toLowerCase();
        String match = "Matches:\n";
        boolean found = false;

        for(Map.Entry<String, String> entry : contacts.entrySet()) {
            if(entry.getKey().toLowerCase().contains(search.toLowerCase()) || entry.getValue().contains(search)) {
                match += entry.getKey() + " : " + entry.getValue() + "\n";
                found = true;
            }
        }
//        input.close();
        if(!found){
            match = search + " not found";
        }
        return match;
    }

    public String downloadApps(String app) {
        String statement = "";
        apps.add(app);
        statement += app + " successfully downloaded";
        return statement;
    }

    public String getDownloadedApps() {
        String statement = "Apps on this phone:\n";
        if(apps.size() == 0) {
            statement = "No apps downloaded";
        } else {
            for(String downloaded : apps) {
                statement += downloaded + "\n";
            }
        }
        return statement;
    }

}
