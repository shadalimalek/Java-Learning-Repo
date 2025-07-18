package LibraryManagement;

public class Book {
    String title;
    String author;
    private boolean isAvailable;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if(isAvailable){
            System.out.println("Book borrowed: " + title);
            isAvailable = false;
        } else {
            System.out.println("Sorry, "+ title +" is already borrowed.");
        }
    }

    public void returnBook() {
        if(isAvailable == false) {
            System.out.println("Book returned: " + title);
            isAvailable = true;
        } else {
            System.out.println(title + " was never Borrowed");
        }
    }

    public void displayStatus() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Status: " + (isAvailable ? "Available" : "Borrowed" ));
        System.out.println("-----------------------------");
    }

}
