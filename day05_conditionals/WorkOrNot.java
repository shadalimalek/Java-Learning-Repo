import java.util.Scanner;

public class WorkOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What day is it today? ");
        String day = sc.nextLine();

        if(day.equalsIgnoreCase("Monday")) {
            System.out.println("Plan your week ahead!");
        }

        if(day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            System.out.println("Enjoy your weekend!");
        }

        sc.close();
    }
}
