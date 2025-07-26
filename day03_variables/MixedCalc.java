package day03_variables;

public class MixedCalc {
    public static void main(String[] args) {
        byte a = 23;
        short b = 354;
        int c = 2355356;
        long d = 2590875475769578560L;
        float e = 4.345f;
        double f = 3.53298;

        long sum = (long) (a + b + c + d);
        double sumo = (double) (e + f);

        System.out.println(sum);
        System.out.println(sumo);
    }
}
