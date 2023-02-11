package main.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public int missingNumber(Integer[] list, int max_num){
//        Set stores only unique values
        Set<Integer> set = new HashSet<>(Arrays.asList(list));

//        loop max_num times, returning the missing int if it is missing from the set.
//        if not, then the array of integers has no missing numbers
//        forgot range of numbers starts at 1, not 0, so i = 1
        for(int i = 1; i <= max_num; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 0;
    }

//    original solution does not account for max number test
//    public static int missingNumber(int[] list, int max_num){
//    //        int[] sortedList = Arrays.stream(list).sorted().toArray();
//        Arrays.sort(list);
//        for(int i = 0; i < max_num; i++){
//            if(++list[i] != list[i + 1]) return list[i];
//        }
//        return 0;
//    }
}
