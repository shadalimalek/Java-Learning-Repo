package LibraryManagement;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Atomic Habit", "James Clear");
        Book book2 = new Book("Think and Grow Rich", "Napoleon Hill");
        Book book3 = new Book("The 4-Hour Workweek ", "Timothy Ferriss");

        book1.borrowBook();
        book1.displayStatus();
        book2.displayStatus();
        book3.displayStatus();
    }
}
