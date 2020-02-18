package exercises.technology.test;

import exercises.technology.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {
    Computer testComp;
    @Before
    public void createComputerObject() {
        testComp = new Computer(450, "Windows X", "Jean");
    }

    @Test
    public void constructorAssignsAllFields(){
        assertEquals(450, testComp.getAvailableStorage(), .001);
        assertEquals("Windows X", testComp.getOperatingSystem());
        assertEquals("Jean", testComp.getOwner());
        assertEquals(100, testComp.getBatteryPercentage());
        assertEquals(1, testComp.getId());
    }

//    @Test
//    public void batteryLowersWithUse() {
//        testComp.useComputer(4);
//        assertEquals(20, testComp.getBatteryPercentage());
//    }
//
//    @Test
//    public void batteryReturns100WhenCharged() {
//        testComp.useComputer(3);
//        assertEquals(40, testComp.getBatteryPercentage());
//        testComp.chargeComputer();
//        assertEquals(100, testComp.getBatteryPercentage());
//    }
//
//    @Test
//    public void spaceReducesWhenFileSaved() {
//        testComp.saveFile(400);
//        assertEquals(50, testComp.getAvailableStorage(), .001);
//    }


}
