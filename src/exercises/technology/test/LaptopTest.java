package exercises.technology.test;

import exercises.technology.Laptop;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import static org.junit.Assert.assertEquals;

public class LaptopTest {
    Laptop personalLaptop;
    @Before
    public void createFirstLaptop(){
        personalLaptop = new Laptop(550, "Windows", "Clara");
    }

    @Test
    public void constructorUsesParentConstructor(){
        assertEquals(550, personalLaptop.getAvailableStorage(), .001);
        assertEquals("Windows", personalLaptop.getOperatingSystem());
        assertEquals("Clara", personalLaptop.getOwner());
    }

//    @Test
//    public void constructorCorrectlyAssignsIds() {
//        Laptop workLaptop = new Laptop(550, "Windows", "TSH");
//        assertEquals(2, workLaptop.getId());
//    }

    @Test
    public void correctlyReturnsMessageIfNoPrograms() {
        assertEquals("No programs installed", personalLaptop.getInstalledPrograms());
    }

    @Test
    public void returnsListOfPrograms(){
        personalLaptop.installProgram("IntelliJ");
        assertEquals("Installed programs: \n" +
                "IntelliJ\n", personalLaptop.getInstalledPrograms());
    }



}
