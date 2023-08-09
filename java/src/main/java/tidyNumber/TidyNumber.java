package tidyNumber;

//https://www.codewars.com/kata/5a87449ab1710171300000fd/train/java

public class TidyNumber {
    public boolean isTidy(int input) {
        int previous = 0;
        for (char character: Integer.toString(input).toCharArray()) {
            if (previous <= (int) character) {
                previous = character;
            } else {
                return false;
            }
        }
        return true;
    }
}
