package camelCaseConvert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamelCaseConvertTest {

    @Test
    void Cases() {
        runTest("Calculate_15_Plus_5_Equals_20", "Calculate15Plus5Equals20");
        runTest("This_Is_Already_Split_Correct", "This_Is_Already_Split_Correct");
        runTest("This_Is_Not_Split_Correct", "ThisIs_Not_SplitCorrect");
        runTest("_Underscore_Marked_Test_Name_", "_UnderscoreMarked_Test_Name_");
    }

    private void runTest(String expected, String input) {
        CamelCaseConvert camelCaseConvert = new CamelCaseConvert();
        assertEquals(expected, camelCaseConvert.convert(input), "Test failed for input \""+input+"\"");
    }
}