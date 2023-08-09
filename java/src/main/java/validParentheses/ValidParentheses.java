package validParentheses;

//https://www.codewars.com/kata/6411b91a5e71b915d237332d/train/java

public class ValidParentheses {
    public Boolean validateString(String input) {
        int counter = 0;
        for (char ch : input.toCharArray()) {
            switch (ch) {
                case '(' -> counter++;
                case ')' -> counter--;
            }
            if (counter < 0) return false;
        }
        return (counter == 0);
    }
}
