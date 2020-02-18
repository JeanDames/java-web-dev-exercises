package exercises.technology.test;

import exercises.technology.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmartPhoneTest {
    SmartPhone iPhone;
//    @Before
//    public void createFirstPhone(){
//        iPhone = new SmartPhone(365, "iOS", "Clara", "Sprint");
//    }

    @Test
    public void constructorUsesParentConstructor(){
        SmartPhone iPhone = new SmartPhone(365, "iOS", "Clara", "Sprint");

        assertEquals(365, iPhone.getAvailableStorage(), .001);
        assertEquals("iOS", iPhone.getOperatingSystem());
        assertEquals("Clara", iPhone.getOwner());
        assertEquals("Sprint", iPhone.getCellularProvider());
        assertEquals(1, iPhone.getId());
    }

    @Test
    public void assignIdSequentially(){
        SmartPhone iPhone = new SmartPhone(365, "iOS", "Clara", "Sprint");

        SmartPhone galaxy = new SmartPhone(450, "Android OS", "Colby", "ATT");
        assertEquals(2, galaxy.getId());
        assertEquals(1, iPhone.getId());
    }

    @Test
    public void correctlyAddsApps() {
        iPhone.downloadApps("Chrome");
        assertEquals("Apps on this phone:\nChrome\n", iPhone.getDownloadedApps());
    }

    @Test
    public void returnsCorrectStatementIfNoAppsDownloaded() {
        assertEquals("No apps downloaded", iPhone.getDownloadedApps());
    }

    @Test
    public void findContactReturnsCorrectlyIfNoMatches(){
        assertEquals("Allen not found", iPhone.findContact("Allen"));
    }

    @Test
    public void findContactsReturnsOffOfPartialEntries(){
        iPhone.setContacts("Charles", "5803011279");
        iPhone.setContacts("Charlee", "3148058888");
        assertEquals("Matches:\nCharles : 5803011279\nCharlee : 3148058888\n", iPhone.findContact("Char"));
    }

    @Test
    public void findContactsOffOfNumbers(){
        iPhone.setContacts("Charles", "5803011279");
        iPhone.setContacts("Charlee", "3148058888");
        assertEquals("Matches:\nCharlee : 3148058888\n", iPhone.findContact("314"));
    }
}
