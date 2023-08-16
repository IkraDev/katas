package catAndMouse

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CatAndMouseTest {

    @Test
    fun caughtCases() {
        runTest("Caught", "..C.....m.", 5)
        runTest("Caught", "...m.........C...D", 10)
    }

    @Test
    fun escapedCases() {
        runTest("Escaped", ".....C............m......", 5)
    }

    @Test
    fun protectedCases() {
        runTest("Protected", "...m....D....C.......", 10)
    }

    @Test
    fun noAnimalsCases() {
        runTest("no cat or no mouse", "...D.....m...", 2)
        runTest("boring without animals", ".......", 2)
    }

    private fun runTest(expected: String, input: String, jumpRange: Int) {
        val catAndMouse = CatAndMouse()
        assertEquals(expected, catAndMouse.check(input, jumpRange), "Test failed for input \"$input\"")
    }
}