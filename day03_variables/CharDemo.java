package day03_variables;

public class CharDemo {
    public static void main(String[] args) {
        char letter = 'A';
        char digit = '9';
        char symbol = '#';
        char hindiChar = 'ज';

        System.out.println("Letter: " + letter);
        System.out.println("Digit: " + digit);
        System.out.println("Symbol: " + symbol);
        System.out.println("Hindi Char: " + hindiChar);

        // char as number
        char code = 255; // Unicode for 'A'
        System.out.println("Char from number 65: " + code);
    }
}

/*
 ❌ Common Mistakes
    Writing "A" (double quotes) instead of 'A' (single quote) → "A" is a String, not a char.
    
    Using more than one character in a char: 'AB' ❌
    
    Forgetting that char is numeric under the hood → You can do math with it.
 */