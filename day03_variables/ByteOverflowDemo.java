package day03_variables;

public class ByteOverflowDemo {
    public static void main(String[] args) {
        byte x = 127;

        byte sum = (byte) (x + 2);

        System.out.println(sum);
    }
}
