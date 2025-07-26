what is a variable?

A variable is a name given to a memory location that stores data. You can think of it like a box where you store values, and later access or change them.

java variable types (Data types)

| Type      | Description            | Example                  |
| --------- | ---------------------- | ------------------------ |
| `int`     | Whole numbers          | `int age = 18;`          |
| `double`  | Decimal numbers        | `double pi = 3.14;`      |
| `char`    | Single character       | `char grade = 'A';`      |
| `String`  | Text (not a primitive) | `String name = "Shad";`  |
| `boolean` | True or false          | `boolean passed = true;` |

java Variable Declaration Syntax:
type variableName = value;

int age = 20;
double height = 5.9;
String name = "Shad";
char grade = 'A';
boolean isStudent = true;


Final Quick Recap: Primitive Numeric Types

| Type     | Size   | Range                           | Precision      | Notes                |
| -------- | ------ | ------------------------------- | -------------- | -------------------- |
| `byte`   | 8-bit  | -128 to 127                     | Integer        | Smallest             |
| `short`  | 16-bit | -32,768 to 32,767               | Integer        | Bigger than byte     |
| `int`    | 32-bit | -2,147,483,648 to 2,147,483,647 | Integer        | Most used            |
| `long`   | 64-bit | Huge                            | Integer        | Use `L` at end       |
| `float`  | 32-bit | ±3.4e38                         | \~7 digits     | Use `f` at end       |
| `double` | 64-bit | ±1.8e308                        | \~15-16 digits | Default for decimals |
