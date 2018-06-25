import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        visitor = new Visitor("Greg", 28, 183);
    }

    @Test
    public void visitorHasName() {
        assertEquals("Greg", visitor.getName());
    }

    @Test
    public void visitorHasAge(){
        assertEquals(28, visitor.getAge());
    }

    @Test
    public void visitorHasHeight() {
        assertEquals(183, visitor.getHeight());
    }
}
