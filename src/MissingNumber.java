import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int[] list, int max_num){
        int[] sortedList = Arrays.stream(list).sorted().toArray();
        for(int i = 0; i < list.length; i++){
            if(++sortedList[i] != sortedList[i + 1]) return sortedList[i];
        }
        return 0;
    }
    public static void main(String[] args) {
        int n = missingNumber(new int[]{2, 1, 4, 3, 6, 5, 7, 10, 9}, 10); //⇒ 8
        System.out.println(n);
    }
}
