package be.ordina.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestingNonPublicTest {

    @Test
    public void testingPublic() {
        assertEquals("This is a test", new TestingNonPublic().aTest());
    }

}