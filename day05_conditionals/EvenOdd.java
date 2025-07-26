import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        if(number > 0) {
            System.out.println("Number is Positive");
        } else if(number < 0){
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is Zero");
        }

        if(number % 2 == 0) {
            System.out.println("It is Even");
        } else {
            System.out.println("It is odd");
        }

        sc.close();
    }
}
