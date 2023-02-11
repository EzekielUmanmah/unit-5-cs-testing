package main.java;

import java.util.ArrayList;

public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
//        assume arr[0] is correctly indexed and start at index 1
        for (int sortedIndex = 1; sortedIndex < arr.length; sortedIndex++) {
//            capture the value at index 1
            int curr = arr[sortedIndex];
//            declare i outside the loop for later reassignment
            int i;
//            loop through the sorted partition comparing the current value against values in the sorted partition
//            right to left. If current value is less than the current sorted partition value, shift the sorted
//            partition value one index to the right. When the loop condition fails, the correct index is found for
//            the current value.
            for(i = sortedIndex; i > 0 && curr < arr[i - 1]; i--){
                arr[i] = arr[i - 1];
            }
            arr[i] = curr;
        }
        return arr;
    }
}
