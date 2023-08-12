package countingDuplicates

//https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1

class CountingDuplicates {
    fun countDuplicates(input: String): Int {
        var amount = 0
        val string = input.lowercase()
        var counted = ""
        string.forEachIndexed { index, c ->
            if (index < input.length - 1 && c !in counted && c in string.substring(index + 1)) {
                counted += counted.plus(c)
                amount++
            }
        }
        return amount
    }
}