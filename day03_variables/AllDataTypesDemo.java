package day03_variables;

public class AllDataTypesDemo {
    public static void main(String[] args) {
        // long: for large integers
        long population = 8_000_000_000L; // use 'L' at the end
        System.out.println("World Population: " + population);

        // float: decimal with low precision
        float piApprox = 3455475.14159f; // use 'f' at the end
        System.out.println("Approximate Pi (float): " + piApprox);

        // double: decimal with high precision
        double piExact = 354754.143;
        System.out.println("Exact Pi (double): " + piExact);

        // char: single character using single quotes
        char grade = 'A';
        char symbol = '@';
        System.out.println("Grade: " + grade);
        System.out.println("Symbol: " + symbol);

        // boolean: true or false
        boolean isPassed = true;
        boolean isAdmin = false;
        System.out.println("Passed Exam? " + isPassed);
        System.out.println("Is Admin? " + isAdmin);
    }
}
