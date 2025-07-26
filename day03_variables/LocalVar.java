//📘 What are they?
// Declared inside methods or blocks.

// Only accessible within that method.

// Not stored in objects.

// No static, public, etc. — just normal type like int, String, etc.
package day03_variables;

public class LocalVar {

    public void showMessage() {
        String message = "Hello from local varaible";
        System.out.println(message);
    }

    public static void main(String[] args) {
        LocalVar obj = new LocalVar();
        obj.showMessage();
    }
}