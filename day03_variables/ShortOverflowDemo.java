package day03_variables;

public class ShortOverflowDemo {
    public static void main(String[] args) {
        for(int i = 32760; i <= 32770; i++) {
            short s = (short) i;
            System.out.println("Original: " + i + " -> As short: " + s);
        }
    }
}
