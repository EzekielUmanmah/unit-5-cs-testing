package test.java;

import main.java.BalancedBrackets;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BalancedBracketsParameterizedTest {
    BalancedBrackets bb = new BalancedBrackets();

    private String input;
    private String output;

    public BalancedBracketsParameterizedTest(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditions(){
        String[][] expectedInputsOutputs = {
                {"(Hello)", String.valueOf(true)},
                {"((Hi)", String.valueOf(false)},
                {")Hi(", String.valueOf(false)},
                {"(<Hi>)", String.valueOf(true)},
                {"", String.valueOf(true)},
                {"(He(l)lo}", String.valueOf(false)}
        };
        return Arrays.asList(expectedInputsOutputs);
    }

    @Test
    public void testBalancedBrackets(){
        assertEquals(output, String.valueOf(bb.isBalanced(input)));
    }

}
