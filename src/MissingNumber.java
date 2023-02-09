import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static int missingNumber(int[] list, int max_num){
//        int[] sortedList = Arrays.stream(list).sorted().toArray();
        Arrays.sort(list);
        for(int i = 0; i < max_num; i++){
            if(++list[i] != list[i + 1]) return list[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        int n = missingNumber(new int[]{2, 1, 4, 3, 6, 5, 7, 10, 9}, 10); //⇒ 8
        System.out.println(n);
    }
}
