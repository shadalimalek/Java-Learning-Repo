import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();

        if(temp > 40) {
            System.out.println("Very Hot");
        } else if(temp > 30) {
            System.out.println("Warm");
        } else if(temp > 20 && temp <= 30) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }

        sc.close();
    }
}
