package tidyNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TidyNumberTest {

    @Test
    void validCases() {
        runTest(true, 23);
        runTest(true, 2689);
        runTest(true, 123456);
        runTest(true, 1246789);
        runTest(true, 123456789);
    }

    @Test
    void invalidCases() {
        runTest(false, 42);
        runTest(false, 321);
        runTest(false, 98321);
        runTest(false, 12345671);
        runTest(false, 123678886);
        runTest(false, 999999998);
    }

    private void runTest(boolean expected, int input) {
        TidyNumber tidyNumber = new TidyNumber();
        assertEquals(expected, tidyNumber.isTidy(input), "Test failed for input \""+input+"\"");
    }
}