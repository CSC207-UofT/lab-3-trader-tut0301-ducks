
import org.junit.*;

import static org.junit.Assert.*;


public class GoatTest {
    Goat g;

    @Before
    public void setUp() throws Exception {
        g = new Goat();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Maaaa~", g.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(3, g.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        g.upgradeSpeed();
        assertEquals(5, g.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        g.downgradeSpeed();
        assertEquals(1, g.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(35, g.getPrice());
    }

}
