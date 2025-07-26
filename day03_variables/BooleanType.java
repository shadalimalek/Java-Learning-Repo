package day03_variables;

public class BooleanType {
    public static void main(String[] args) {
        int age = 20;
        boolean isCitizen = true;

        boolean isAdult = age >= 18;

        // Check if both conditions are true
        boolean canVote = isAdult && isCitizen;

        if (canVote) {
            System.out.println("✅ You can vote");
        } else {
            System.out.println("❌ You cannot vote");
        }
    }
}
