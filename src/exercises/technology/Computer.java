package exercises.technology;

public class Computer extends AbstractEntity {

    private int batteryPercentage = 100;
    private double availableStorage;
    private String operatingSystem;
    private String owner;
    private static int id;
    public static int newId = 0;

    public Computer (double aAvailableStorage, String aOperatingSystem, String aOwner) {
        this.availableStorage = aAvailableStorage;
        this.operatingSystem = aOperatingSystem;
        this.owner = aOwner;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public double getAvailableStorage() {
        return availableStorage;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getOwner() {
        return owner;
    }

    public String setNewOwner(String newOwner) {
        owner = newOwner;
        return "Owner changed to: " + getOwner();
    }

    public void chargeComputer() {
        batteryPercentage = 100;
    }

    public void saveFile(double fileSize) {
        if((availableStorage - fileSize) < 0) {
            System.out.println("Not enough space to save file");
        } else {
            availableStorage -= fileSize;
            System.out.println("File saved");
        }
    }

    public void useComputer(int hours){
        if(batteryPercentage - (hours*20) < 0) {
            batteryPercentage = 0;
            System.out.println("Please charge the device");
        } else {
        batteryPercentage -= hours*20;
            System.out.println("Device is at " + getBatteryPercentage() + "%");
        }
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int setId() {
        id = newId + 1;
        newId++;
        return id;
    }
}
