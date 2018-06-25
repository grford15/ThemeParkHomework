import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        rollercoaster = new Rollercoaster("Nemisis", 160);
        visitor = new Visitor("Greg", 28, 183);
    }

    @Test
    public void rollercoasterHasName(){
        assertEquals("Nemisis", rollercoaster.getName());
    }

    @Test
    public void hasHeightLimit() {
        assertEquals(160, rollercoaster.getHeightRestriction());
    }

    @Test
    public void visitorCanRide() {
        assertEquals(true, rollercoaster.visitorCanRide(visitor, rollercoaster));
    }
}
