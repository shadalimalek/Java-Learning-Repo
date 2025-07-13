## Day 02 – Java Basics: Syntax, Output, and Comments

## What you'll learn today:

* How Java programs are structured
* How to print text using print() and println()
* How to write single-line and multi-line comments
* Common beginner mistakes to avoid

---

## Java Program Structure:

In Java, every line of code must be inside a class. Every program starts with the main() method. The file name and class name must match exactly.

Example (file should be named JavaBasics.java):

public class JavaBasics {
public static void main(String\[] args) {
System.out.println("This is my first Java program.");
System.out.println("Java code runs inside main().");
}
}

## Explanation:

* public class JavaBasics → class name (must match file name)
* public static void main → entry point of the program
* System.out.println → prints text and moves to a new line

---

## Java Output – print() vs println():

System.out.print() → prints text but does NOT move to a new line
System.out.println() → prints text and then moves to a new line

## Example (OutputPrint.java):

public class OutputPrint {
public static void main(String\[] args) {
System.out.print("Same line ");
System.out.print("continued.");
System.out.println(); // prints just a line break
System.out.println("Now on a new line.");
}
}

## Output:
Same line continued.
Now on a new line.

---

## Java Comments:

Comments are used to explain code. Java ignores them during execution.

## Single-line comment:
// This is a single-line comment

## Multi-line comment:
/\*
This is a multi-line comment.
It can span multiple lines.
\*/

## Example (CommentsExample.java):

public class CommentsExample {
public static void main(String\[] args) {
// This prints a message
System.out.println("Comments are ignored by Java.");

```
    /*
     This block won’t run.
     It’s just to explain or disable code.
    */
}
```

}

---

## Common Mistakes:

* Missing semicolon → compile error
* Class name doesn't match file name → won’t compile
* Writing system instead of System → Java is case-sensitive
* No main method → Java won’t know where to start execution

---

## Practice Checklist:

* Create a new .java file and type out the full structure yourself
* Try both System.out.print() and System.out.println()
* Write at least one single-line and one multi-line comment
* Purposely make a mistake (like misspelling System or forgetting semicolon) and observe the error

---

## Files in This Folder:

JavaBasics.java → basic structure and println()
OutputPrint.java → print() vs println()
CommentsExample.java → examples of both comment types
notes.md → this full explanation (you’re reading it)

