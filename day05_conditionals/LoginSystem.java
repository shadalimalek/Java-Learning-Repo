import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "1234";

        System.out.print("Enter username: ");
        String userInput = sc.nextLine();
        System.out.print("Enter password: ");
        String passInput = sc.nextLine();

        if(username.equals(userInput)) {
            if(password.equals(passInput)){
                System.out.println("Welcome admin!");
            }else {
                System.out.println("Wrong password");
            }
        }else{
            System.out.println("Wrong username");
        }
        
        sc.close();
    }
}
