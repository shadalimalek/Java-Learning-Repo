import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Marks
        System.out.print("Enter Marks (0–100): ");
        int marks = sc.nextInt();
        if (marks < 0 || marks > 100) {
            System.out.println("❌ Enter valid marks (0–100)");
            sc.close();
            return;
            
        }
        

        // Input: Income
        System.out.print("Enter your family income (INR): ");
        int income = sc.nextInt();
        sc.nextLine(); // Clear buffer

        // Input: Certificate
        System.out.print("Do you have a national certificate? (yes/no): ");
        String cert = sc.nextLine().trim();

        // Input: Sports
        System.out.print("Do you participate in sports or extracurriculars? (yes/no): ");
        String sports = sc.nextLine().trim();

        // Score calculation
        int score = 0;

        // Marks (max 50)
        score += marks * 0.5;

        // Income points (max 20)
        if (income < 200000) {
            score += 20;
        } else if (income < 500000) {
            score += 10;
        }

        // Certificate (max 15)
        if (cert.equalsIgnoreCase("yes")) {
            score += 15;
        }

        // Sports (max 15)
        if (sports.equalsIgnoreCase("yes")) {
            score += 15;
        }

        // Final Output
        System.out.println("\n📊 Total Scholarship Score: " + score);

        if (score >= 85) {
            System.out.println("✅ Eligible for 100% Scholarship");
        } else if (score >= 75) {
            System.out.println("✅ Eligible for 75% Scholarship");
        } else if (score >= 55) {
            System.out.println("✅ Eligible for 50% Scholarship");
        } else {
            System.out.println("❌ Not Eligible for Scholarship");
        }

        sc.close();
    }
}
