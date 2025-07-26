import java.util.Scanner;

public class LibraryAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Memebership type (Student, Teacher, Guest)");
        String membership = sc.nextLine();

        
    }    
}
