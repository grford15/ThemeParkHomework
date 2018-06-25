import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeerStallTest {

    BeerStall beerStall;

    @Before
    public void setUp() throws Exception {
        beerStall = new BeerStall("BeirHaus", "Otto Krautz", 101);
    }

    @Test
    public void hasAgeRestriction() {
        assertEquals(18, beerStall.getAgeRestriction());
    }
    
}
