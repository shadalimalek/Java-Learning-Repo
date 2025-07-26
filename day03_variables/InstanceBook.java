// 🔷 STEP 2: Instance Variables — (also called object variables)
// 📘 What are they?
// Declared inside a class, but outside methods.

// Every object has its own copy of these variables.

// Used to store data for objects.

// They can be accessed using the object (objectName.variableName).

package day03_variables;

class Book {
    String title;
    String author;
    
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Atomic Habit";
        b1.author = "James Clear";
        b1.display();

        Book b2 = new Book();
        b2.title = "Atomic pencil";
        b2.author = "James Unclear";
        b2.display();
    }
}
