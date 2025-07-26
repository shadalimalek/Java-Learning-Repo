package day03_variables;

class InsStudent {
    String name; // Instance Variable
    int age; // Instance Variable
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        InsStudent s1 = new InsStudent();
        s1.name = "Shad";
        s1.age = 19;
        s1.display();

        InsStudent s2 = new InsStudent();
        s2.name = "Rehan";
        s2.age = 20;
        s2.display();
    }
}
