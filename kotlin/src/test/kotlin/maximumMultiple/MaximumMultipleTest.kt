package maximumMultiple

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MaximumMultipleTest {

    @Test
    fun validCase() {
        runTest(6, 2, 7)
        runTest(50, 10, 50)
        runTest(185, 37, 200)
    }

    private fun runTest(expected: Int, divisor: Int, bound: Int) {
        val maximumMultiple = MaximumMultiple()
        assertEquals(expected, maximumMultiple.findMaxMultiple(divisor, bound), "Test failed for divisor \"$divisor\" and bound \"$bound\"")
    }
}