package exercises.technology;

import java.util.ArrayList;

public class Laptop extends Computer {

    private ArrayList<String> programs = new ArrayList<>();

    public Laptop(double aAvailableStorage, String aOperatingSystem, String aOwner) {
        super(aAvailableStorage, aOperatingSystem, aOwner);
    }

    public String getInstalledPrograms(){
        String programString;
        if(programs.size()== 0) {
            programString = "No programs installed";
        } else {
            programString = "Installed programs: \n";
            for (String installed : programs) {
                programString += installed + "\n";
            }
        }
        return programString;
    }

    public String installProgram(String program) {
        programs.add(program);
        return program;
    }


}
