package StudentListManagement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        //add 3 Students
        students.add(new Student("Shad", 1, 95.0));
        students.add(new Student("Ayaan", 2, 88.5));
        students.add(new Student("Rehan", 3, 76.0));

        for(Student s : students) {
            s.displayDetails();
        }
    }
}
