import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HamsterTest {
    Hamster hammy;

    @Before
    public void setUp() throws Exception {
        hammy = new Hamster();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("HAMSTER SOUND!!!", hammy.sound());
    }

    @Test(timeout = 50)
    public void TestPrice(){ assertEquals(1000000, hammy.getPrice());}

}
