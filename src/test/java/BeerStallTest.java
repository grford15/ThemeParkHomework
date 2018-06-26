import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeerStallTest {

    BeerStall beerStall;
    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        beerStall = new BeerStall("BeirHaus", "Otto Krautz", 101);
        visitor = new Visitor("Greg", 28, 183);
    }

    @Test
    public void hasAgeRestriction() {
        assertEquals(18, beerStall.getAgeRestriction());
    }

    @Test
    public void canBuyBeer(){
        assertEquals(true, beerStall.isAllowedTo(visitor));
    }

}
