package catAndMouse

//https://www.codewars.com/kata/57ee2a1b7b45efcf700001bf

class CatAndMouse {
    fun check(string: String, jumpRange: Int): String {
        if ('C' !in string && 'm' !in string && 'D' !in string) return "boring without animals"

        var counting = 0
        for (char: Char in string) {
            if (counting > jumpRange + 1) return "Escaped"
            when(char) {
                'C', 'm' -> if (counting > 0) {
                                return "Caught"
                            } else {
                                counting = 1
                            }
                'D' -> if (counting > 0) return "Protected"
                '.' -> if (counting > 0) counting++
            }
        }
        return "no cat or no mouse"
    }
}