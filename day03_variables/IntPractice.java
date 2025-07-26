/*
 What is int ?
 int is short for interger, used to store whole numbers (no decimals).
 Syntax : 
    int age = 25;

Memory: 
    size: 4 bytes.
    range: -2,147,483,648 to 2,147,483,647

Real-life Use examples: 
    int age = 25; -- Age of person
    int score = 450; -- Score in game
    int books = 12; -- numbers of books

Mistakes to avoid:
    decimal in int: 
        int value = 5.5; //Error : incompatible types
    Too large value:
        int big = 3,000,000,000; //Error : integer number too large
 */


package day03_variables;

public class IntPractice {
    public static void main(String[] args) {
        int age = 19000;
        int score = 29000;
        int books = 15;
        
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);
        System.out.println("Books: " + books);
    }
}
