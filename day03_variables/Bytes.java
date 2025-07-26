/*What is byte?
    byte is an 8-bit signed integer in Java. it's often used when you're working with very small numbers to save memory,
    especially in large arrays like image data or file processing.

    

    📊 Memory Size, Range, and Defaults:


    | Property      | Value           |
    | ------------- | --------------- |
    | Size          | 1 byte (8 bits) |
    | Range         | -128 to 127     |
    | Default Value | 0               |

*/
package day03_variables;

public class Bytes {
    // public static void main(String[] args) {
    //     byte a = 10, b = 20;
    //     int c = a + b; // ❌ Compilation error!

    //     System.out.println(c);

    // }

    public static void main(String[] args) {
        byte age = 25;
        byte minTemp = -100;
        byte maxType = 100;

        byte result = (byte) (maxType - minTemp);

        System.out.println("Age: " + age);
        System.out.println("Temperature Range: " + result);
    }

}
