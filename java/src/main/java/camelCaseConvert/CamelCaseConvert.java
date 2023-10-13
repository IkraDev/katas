package camelCaseConvert;

//https://www.codewars.com/kata/5b1956a7803388baae00003a

import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;

public class CamelCaseConvert {

    private char previous;
    public String convert(String input) {
        previous = 0;
        var charArray = input.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char c: charArray) {
            if (checkUppercaseOrNumberOrUnderscore(c)) {
                result.append("_").append(c);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public Boolean checkUppercaseOrNumberOrUnderscore(char c) {
        boolean check = (isDigit(c) && !isDigit(previous));
        if (isUpperCase(c)) {
            check = true;
        }
        if (previous == 0 || previous == '_') {
            check = false;
        }
        previous = c;
        return check;

    }
}
