package main.java;

import java.util.HashMap;
import java.util.Stack;

//  this solution does not account for overlapping brackets e.g. ({ )}
public class BalancedBrackets {
    public static boolean isBalanced(String s) {
        Stack<Character> tracker = new Stack<>();
        HashMap<Character, Character> brackets = new HashMap<Character, Character>();
//        because of the LIFO nature of stacks, the example places the closing brackets as the key. This is essential
//        to the last check for matching bracket types.
        brackets.put('(', ')');
        brackets.put('{', '}');
        brackets.put('<', '>');
        brackets.put('[', ']');

        for(int i = 0; i < s.length(); i++){
//            push opening brackets into tracker
            if(brackets.containsKey(s.charAt(i))){
                tracker.push(s.charAt(i));
            } else if (brackets.containsValue(s.charAt(i))) {
//                immediate return for closing brackets w/o opening brackets
                if(tracker.isEmpty()) {
                    return false;
                }

                Character lastBracket = tracker.pop();
//                lastBracket will always be an opening bracket; use get() on the hashmap to return the matching
//                closing bracket. If none of the string chars match, then there is no matching closing bracket
                if(!brackets.get(lastBracket).equals(s.charAt(i))) {
                    return false;
                }
            }
        }
//        there are no brackets opening or closing
        return tracker.isEmpty();
    }
}
