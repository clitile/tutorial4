package tut4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static tut4.Calc.add;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertEquals(3, add(1, 2));
    }
}
