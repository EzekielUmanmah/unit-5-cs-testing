package main.java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MissingNumber mn = new MissingNumber();
        int n = mn.missingNumber(new Integer[]{2, 1, 4, 3, 6, 5, 7, 10, 9}, 10);
        System.out.println("The missing number is: " + n);

        boolean isBalanced = BalancedParentheses.isBalanced("(Today) we r)ide!");
        System.out.println("The string has balanced parentheses: " + isBalanced);

        BalancedBrackets bb = new BalancedBrackets();
        boolean balancedBrackets = bb.isBalanced("Do{ <(you)>}");
        System.out.println("The string has balanced brackets: " + balancedBrackets);

        int[] insertionSort = InsertionSort.insertionSort(new int[]{3, 2, -59, 67});
        System.out.println(Arrays.toString(insertionSort));
    }
}
