package day03_variables;

public class ByteCalc {
    public static void main(String[] args) {
        byte x= 40;
        byte y= 50;
        byte z= -90;

        byte sum = (byte) (x + y);
        byte diff = (byte) (z - x);

        System.out.println("Sum: " + sum);
        System.out.println(diff);
    }

}
