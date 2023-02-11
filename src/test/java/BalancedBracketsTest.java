package test.java;

import main.java.BalancedBrackets;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    BalancedBrackets bb = new BalancedBrackets();
    @Test
    void testBalanced_balancedParentheses() {
        assertTrue(bb.isBalanced("(Hello)"));
    }

    @Test
    void testBalanced_extraOpeningParentheses(){
        assertFalse(bb.isBalanced("((Hi)"));
    }

    @Test
    void testBalanced_wrongOrderParentheses(){
        assertFalse(bb.isBalanced(")Hi("));
    }

    @Test
    void testBalanced_balancedNestedBrackets(){
        assertTrue(bb.isBalanced("(<Hi>)"));
    }

    @Test
    void testBalanced_emptyStringIsBalanced(){
        assertTrue(bb.isBalanced(""));
    }

    @Test
    void testBalanced_nonMatchingBrackets(){
        assertFalse(bb.isBalanced("(He(l)lo}"));
    }
}
