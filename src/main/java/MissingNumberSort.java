package main.java;

import java.util.Arrays;

public class MissingNumberSort {
    public int missingNumberSort(int[] nums, int maxNum) {
        Arrays.sort(nums);

        for (int i = 1; i < maxNum; i += 1) {
            if (i != nums[i - 1]) {
                return i;
            }
        }

        if (nums.length == maxNum && nums[maxNum - 1] == maxNum) {
            return 0;
        }

        return maxNum;
    }
}
