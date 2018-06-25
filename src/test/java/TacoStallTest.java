import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TacoStallTest {

    TacoStall tacoStall;

    @Before
    public void setUp() throws Exception {
        tacoStall = new TacoStall("Zero Gradi", "Mario Lopez", 100);
    }

    @Test
    public void hasName() {
        assertEquals("Zero Gradi", tacoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Mario Lopez", tacoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(100, tacoStall.getParkingSpot());
    }
}
