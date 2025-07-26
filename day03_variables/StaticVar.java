// 🔷 STEP 3: Static Variables — (Class-level / Shared)
// 📘 What are Static Variables?
// Declared using static keyword inside the class.

// Shared across all objects — only one copy exists.

// Accessed using: ClassName.variableName (or objectName.variableName but not recommended).


package day03_variables;

class StaticStudent {
    String name;
    static String school = "Greenwood High";

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("School: " + school);
    }


    public static void main(String[] args) {
        StaticStudent s1 = new StaticStudent();
        s1.name = "Shad";
        s1.display();

        StaticStudent s2 = new StaticStudent();
        s2.name = "Rehan";
        s2.display();
    }
} 
