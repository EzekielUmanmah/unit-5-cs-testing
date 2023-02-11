package test.java;

import main.java.MissingNumber;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MissingNumberTest {
    private final Integer[] missingMax = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    private final Integer[] missingNone = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    private final Integer[] missing3 = { 1, 2, 4, 5, 6, 7, 8, 9 };

    MissingNumber mn = new MissingNumber();

    @Test
    public void testMissingNumber_MissingMax(){
        assertEquals(10, mn.missingNumber(missingMax, 10));
    }

    @Test
    public void testNoneMissing_noMissingNumber(){
        assertEquals(0, mn.missingNumber(missingNone, 10));
    }

    @Test
    public void testMissing3_Missing3(){
        assertEquals(3, mn.missingNumber(missing3, 10));
    }
}
