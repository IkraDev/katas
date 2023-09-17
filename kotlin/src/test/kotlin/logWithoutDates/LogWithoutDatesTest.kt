package logWithoutDates

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LogWithoutDatesTest {
    @Test
    fun validCase() {
        runTest(1, listOf("00:00:00", "00:01:11", "02:15:59", "23:59:58", "23:59:59"))
        runTest(1, listOf("12:12:12"))
        runTest(2, listOf("12:00:00", "23:59:59", "00:00:00"))
        runTest(0, listOf())
        runTest(5, listOf("20:20:01", "20:20:00", "20:20:21", "02:01:01", "02:00:01", "00:00:00"))
    }

    private fun runTest(expected: Int, input: List<String>) {
        val logWithoutDates = LogWithoutDates()
        assertEquals(expected, logWithoutDates.calculateDayNum(input), "Test failed for input \"$input\"")
    }
}