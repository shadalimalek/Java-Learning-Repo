import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();
            
        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        int maths = getValidMarks(sc, "Maths");
        int physics = getValidMarks(sc, "Physics");
        int bio = getValidMarks(sc, "Biology");
        int chemistry = getValidMarks(sc, "Chemistry");
        int english = getValidMarks(sc, "English");


            
        Student s1 = new Student(name, rollNo, maths, physics, bio, chemistry, english);
        int total = s1.getTotalMarks();
        double avg = s1.getAverage();
        String grade = s1.getGrade();

        System.out.println("----- Report Card -----");
        System.out.println("Name: " + s1.name);
        System.out.println("Roll No: " + s1.rollNo);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
        sc.close();
    }

    public static int getValidMarks(Scanner sc, String subjectName) {
        int marks;
        do {
            System.out.print("Enter " + subjectName + " marks (0-100): ");
            marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid Marks! Please enter between 0 and 100.");
            }
        } while (marks < 0 || marks > 100);
        return marks;
    }
}
