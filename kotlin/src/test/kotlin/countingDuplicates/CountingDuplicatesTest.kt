package countingDuplicates

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CountingDuplicatesTest {
    @Test
    fun validCase() {
        runTest(0, "abcde")
        runTest(2, "aabbcde")
        runTest(2, "aabBcde")
        runTest(2, "Indivisibilities")
        runTest(2, "aA11")
    }

    private fun runTest(expected: Int, input: String) {
        val countingDuplicates = CountingDuplicates()
        assertEquals(expected, countingDuplicates.countDuplicates(input), "Test failed for input \"$input\"")
    }
}