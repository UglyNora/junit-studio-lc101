package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {



    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void stringContainingCharactersWithBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[abc]"));
    }

    @Test
    public void stringContainingTwoOppositeBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void unbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void stringContainingTwoOpeningBracketsInaRowReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void stringContainingOnlyOneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode["));
    }

    @Test
    public void stringContainingOpeningBracketBeginningAndClosingBracketAtEndReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }


    @Test
    public void stringContainingOpeningBracketAndClosingBracketAtBeginningReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void stringContainingOpeningBracketAndClosingBracketAtEndReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }
    @Test
    public void bracketsContainingBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]]"));
    }
}
