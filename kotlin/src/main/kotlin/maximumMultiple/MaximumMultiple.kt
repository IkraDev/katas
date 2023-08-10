package maximumMultiple

//https://www.codewars.com/kata/5aba780a6a176b029800041c

class MaximumMultiple {
    fun findMaxMultiple(divisor: Int, bound: Int): Int {
        for (n in bound downTo 1) {
            if (n % divisor == 0) return n
        }
        return -1
    }
}