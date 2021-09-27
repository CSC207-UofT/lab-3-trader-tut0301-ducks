import org.junit.*;

import static org.junit.Assert.*;

public class CowTest {
    Cow cow;

    @Before
    public void setUp() throws Exception {
        cow = new Cow();
    }

    @Test
    public void TestSound(){
        assertEquals("MOOOOOOOOOOOOOO", cow.sound());
    }

    @Test



    public void TestgetPrice(){ assertEquals(0, cow.getPrice());}
}
