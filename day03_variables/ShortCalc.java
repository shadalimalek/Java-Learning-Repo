package day03_variables;

public class ShortCalc {
    public static void main(String[] args) {
        short a = 20000;
        short b = 15000;
        short c = -5000;

        short sum = (short) (a + b);
        
        System.out.println(sum);

        short net = (short) (sum + c);

        System.out.println(net);
    }
}
