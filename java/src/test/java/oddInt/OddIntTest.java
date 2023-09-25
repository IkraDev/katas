package oddInt;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OddIntTest {
    @Test
    void Cases() {
        runTest(7, List.of(7));
        runTest(0, List.of(0));
        runTest(2, List.of(1,1,2));
        runTest(0, List.of(0,1,0,1,0));
        runTest(4, List.of(1,2,2,3,3,3,4,3,3,3,2,2,1));
    }

    private void runTest(Integer expected, List<Integer> input) {
        OddInt oddInt = new OddInt();
        assertEquals(expected, oddInt.findOdd(input), "Test failed for input \""+input+"\"");
    }
}