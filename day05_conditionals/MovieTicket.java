import java.util.Scanner;

public class MovieTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your age: ");
        int age = sc.nextInt();

        if(age < 5) {
            System.out.println("Ticket is free!");
        } else if(age >= 5 && age <=12) {
            System.out.println("Ticket Price: 100");
        } else if(age >= 13 && age <= 60 ) {
            System.out.println("Ticket Price: 200");
        } else{
            System.out.println("Ticket Price: 120");
        }
    }
}
