import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DuckTest {
    Duck d;

    @Before
    public void setUp() throws Exception {
        d = new Duck();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Quack!", d.sound());
    }

    @Test(timeout = 50)
    public void TestPrice() { assertEquals(5, d.getPrice());}
}
