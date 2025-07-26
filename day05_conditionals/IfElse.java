import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a = sc.nextInt();

        if(a > 0) {
            System.out.println("Number is Positive");
        } else if(a < 0){
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is Zero");
        }

        sc.close();
    }
}