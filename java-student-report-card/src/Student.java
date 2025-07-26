public class Student {
    int maths;
    int physics;
    int chemistry;
    int bio;
    int english;
    String name;
    int rollNo;

    public Student(String name, int rollNo, int maths, int physics, int bio, int chemistry, int english) {
        this.name = name;
        this.bio = bio;
        this.chemistry = chemistry;
        this.maths = maths;
        this.physics = physics;
        this.english = english;
        this.rollNo = rollNo;
    }

    public int getTotalMarks() {
        return maths + physics + chemistry + bio + english;
    }

    public double getAverage() {
        return getTotalMarks() / 5.0;
    }

    public String getGrade() {
        double avg = getAverage();
        
        if(avg >= 90) return "A+";
        else if(avg >= 80) return "A";
        else if(avg >= 70) return "B";
        else if(avg >= 60) return "C";
        else if(avg >= 50) return "D";
        else return "F";
    }
}
