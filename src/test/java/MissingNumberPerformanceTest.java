package test.java;

import main.java.MissingNumber;
import main.java.MissingNumberSort;
import main.java.MissingNumberSum;
import org.junit.Test;

public class MissingNumberPerformanceTest {
    MissingNumber mn = new MissingNumber();
    MissingNumberSort mnSort = new MissingNumberSort();
    MissingNumberSum mnSum = new MissingNumberSum();
    private final int[] missingMax = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    private final int[] missingNone = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    private final int[] missing3 = { 1, 2, 4, 5, 6, 7, 8, 9 };
    private final int loops = 1000000;
    @Test(timeout=100)
    public void testMn(){
        Integer[] missingMax = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Integer[] missingNone = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Integer[] missing3 = { 1, 2, 4, 5, 6, 7, 8, 9 };
        for(int i = 0; i < loops; i++){
            mn.missingNumber(missingMax, 10);
            mn.missingNumber(missingNone, 10);
            mn.missingNumber(missing3, 10);
        }
    }

    @Test(timeout = 100)
    public void testMnSort(){
        mnSort.missingNumberSort(missingMax, 10);
        mnSort.missingNumberSort(missingNone,10);
        mnSort.missingNumberSort(missing3, 10);
    }

    @Test(timeout = 100)
    public void testMnSum(){
        mnSum.missingNumberSum(missingMax, 10);
        mnSum.missingNumberSum(missingNone, 10);
        mnSum.missingNumberSum(missing3, 10);
    }
}
