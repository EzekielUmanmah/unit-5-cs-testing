package main.java;

import java.util.Arrays;

public class MissingNumberSum {
    public int missingNumberSum(int[] nums, int maxNum) {
        int expectedSum = 0;
        for (int i = 1; i <= maxNum; i += 1) {
            expectedSum += i;
        }

        int actualSum = Arrays.stream(nums).sum();

        return expectedSum - actualSum;
    }
}
