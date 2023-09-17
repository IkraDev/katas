package logWithoutDates

//https://www.codewars.com/kata/64cac86333ab6a14f70c6fb6

class LogWithoutDates {
    fun calculateDayNum(list: List<String>): Int {
        if (list.isEmpty()) return 0
        if (list.size == 1) return 1
        var counter = 1
        var previous = "00:00:00"
        for (time in list) {
            if (!checkSameDay(previous, time)) {
                counter++
            }
            previous = time
        }
        return counter

    }

    fun checkSameDay(previous: String, current: String): Boolean {
        val previousNums = previous.split(':')
        val currentNums = current.split(':')

        val resultList = intArrayOf(
            currentNums[0].toInt() - previousNums[0].toInt(),
            currentNums[1].toInt() - previousNums[1].toInt(),
            currentNums[2].toInt() - previousNums[2].toInt()
        )

        return when {
            resultList[0] < 0 -> false
            resultList[0] > 0 -> true
            else -> when {
                resultList[1] < 0 -> false
                resultList[1] > 0 -> true
                else -> when {
                    resultList[2] < 0 -> false
                    resultList[2] > 0 -> true
                    else -> true
                }
            }
        }

    }
}