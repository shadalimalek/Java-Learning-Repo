import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your age: ");
        int age = sc.nextInt();

        if(age >= 18) {
            System.out.println("You can vote.");
        }else{
            System.out.println("You can't vote yet.");
        }

        sc.close();
    }
}
