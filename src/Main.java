import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = MissingNumber.missingNumber(new int[]{2, 1, 4, 3, 6, 5, 7, 10, 9}, 10); //⇒ 8
        System.out.println("The missing number is: " + n);

        boolean isBalanced = BalancedParentheses.isBalanced("(Today) we r)ide!");
        System.out.println("The string has balanced parentheses: " + isBalanced);

        boolean balancedBrackets = BalancedBrackets.isBalanced("Do{ <(you)>}");
        System.out.println("The string has balanced brackets: " + balancedBrackets);

        int[] insertionSort = InsertionSort.insertionSort(new int[]{3, 2, -59, 67});
        System.out.println(Arrays.toString(insertionSort));
    }
}
