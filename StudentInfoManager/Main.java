package StudentInfoManager;
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Shad Ali", 12, 93.9);

        Student student2 = new Student("Sahil", 24, 92.4);

        Student student3 = new Student("Musab", 22, 90.0);

        student1.displayDetails();

        student2.displayDetails();

        student3.displayDetails();

    }
}