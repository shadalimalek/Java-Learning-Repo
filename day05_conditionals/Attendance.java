import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your attendance percentage: ");
        int attendance = sc.nextInt();
        sc.nextLine(); // 🔥 Fix: clear the leftover newline

        System.out.print("Do you have medical certificate (yes/no): ");
        String medCert = sc.nextLine(); // Use nextLine here to read full input

        if(attendance >= 75 || medCert.equalsIgnoreCase("yes")) {
            System.out.println(" Allowed to sit in exam");
        } else {
            System.out.println(" Not allowed to sit in exam");
        }
    }
}
