package exercises.technology;

public class Main {
    public static void main(String[] args) {

        Laptop myLaptop = new Laptop(300, "Windows", "Clara");
        System.out.println(myLaptop.getId());
        Laptop workLaptop = new Laptop(500, "Windows", "Bless");
        System.out.println(workLaptop.getId());
//
        SmartPhone rogue = new SmartPhone(350, "iOS", "Jean", "Sprint");
        System.out.println(rogue.getId());
        SmartPhone workPhone = new SmartPhone(350, "iOS", "Jean", "Sprint");
        System.out.println(workPhone.getId());
        SmartPhone charlesPhone = new SmartPhone(400, "iOS", "Charles", "Sprint");
        System.out.println(charlesPhone.getId());
//        rogue.setContacts("Charles", "5803011279");
//        rogue.setContacts("Jake", "3148059541");
//        rogue.setContacts("Charlee", "6183157775");
//        System.out.println(rogue.findContact("Char"));
    }
}
