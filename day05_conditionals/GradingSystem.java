import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        
        if(marks < 0 || marks > 100) {
            System.out.println("Enter valid marks");
        } else if(marks >= 90){
            System.out.println("Your Grade is A");
        } else if(marks >= 75){
            System.out.println("Your Grade is B");
        } else if(marks >= 50){
            System.out.println("Your Grade is c");
        } else if(marks < 50){
            System.out.println("Congratualtions You failed");
        }

        sc.close(); // good habit to close Scanner
    }
}
