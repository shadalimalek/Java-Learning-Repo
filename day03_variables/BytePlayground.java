package day03_variables;

public class BytePlayground {
    public static void main(String[] args) {
        byte a = 100;
        byte b = 27;
        byte sum = (byte) (a + b); //127 -- max limit

        System.out.println("100 + 27 = " + sum);

        byte c = 127;
        byte d = (byte) (c + 1);

        System.out.println("127 + 1 = " + d);

        //show full overflow circle
        for(int i = 0; i < 5; i++) {
            byte rotated = (byte) (127 + i);
            System.out.println("127 + " + i + " = " + rotated);
        }

        //underflow test
        byte e = -128;
        byte f = (byte) (e - 1);
        System.out.println("-128 - 1 = " + f);
    }
}
