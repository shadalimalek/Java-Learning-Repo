package StudentManagement;

public class Student {
    String name;
    int rollNo;
    double marks;

    public Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("----------Student Information----------");
        System.out.println("Name: " + name);
        System.out.println("RollNo: " + rollNo);
        System.out.println("Marks: " + marks +"%");
    }
}
