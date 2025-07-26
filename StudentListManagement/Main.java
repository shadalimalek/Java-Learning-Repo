package StudentListManagement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int targetRollNo = 3;
        boolean found = false;
        int removeRollNo = 3;
        boolean removed = false;

        ArrayList<Student> students = new ArrayList<>();

        //add 3 Students
        students.add(new Student("Shad", 1, 95.0));
        students.add(new Student("Ayaan", 2, 88.5));
        students.add(new Student("Rehan", 3, 76.0));

        for(Student s : students) {
            if(s.rollNo == targetRollNo) {
                s.displayDetails();
                found = true;
                break;
            }
        }

        for(int i = 0; i < students.size(); i++) {
            if(students.get(i).rollNo == removeRollNo) {
                students.remove(i);
                System.out.println("Student with roll no " + removeRollNo + " remove.");
                removed = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Student not found");
        }

        if(!removed) {
            System.out.println("Student with roll no " + removeRollNo + " not found.");
        }
    }
}
