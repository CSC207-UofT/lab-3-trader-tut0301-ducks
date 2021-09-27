/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class MonkeyTest {
    Monkey m;

    @Before
    public void setUp() throws Exception {
        m = new Monkey();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("OOOHAHAHHAHAHOOOOHAHAHAH!", m.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(8, m.getPrice());
    }

}