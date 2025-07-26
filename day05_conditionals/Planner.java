import java.util.Scanner;

public class Planner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many hours did you sleep? ");
        int hours = sc.nextInt();


        System.out.println("How many glasses of water did you drink today?");
        int water = sc.nextInt();

        if(hours < 7) {
            System.out.println("You need more rest today.");
        }
        
        if(hours >= 7) {
            System.out.println("Great! You're well rested!");
        }

        if(water < 4) {
            System.out.println("Drink more water!");
        }

        if(water >= 8){
            System.out.println("Awesome! You're well hydrated.");
        }
        sc.close();
    }
}
