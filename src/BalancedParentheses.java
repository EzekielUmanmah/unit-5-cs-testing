public class BalancedParentheses {
    public static boolean isBalanced(String s){
        int opening = 0;
        int closing = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') opening++;
            if(s.charAt(i) == ')') closing++;
        }
        return opening == closing;
    }
}
