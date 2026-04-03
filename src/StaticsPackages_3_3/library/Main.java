package StaticsPackages_3_3.library;


import StaticsPackages_3_3.library.model.LibraryMember;
import StaticsPackages_3_3.library.system.Library;
import StaticsPackages_3_3.library.model.Book;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Introduction to Java Programming", "John Smith", "");
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", "");
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", "");

        LibraryMember joke = new LibraryMember("joku", 30234);
        LibraryMember joke2 = new LibraryMember("joku2", 40220);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.borrowBook(joke2, "The Art of Fiction");
        System.out.println("user " +joke2.name + " have borrowed a book");
        joke2.displayBorrowBook();
        System.out.println("return a book");
        library.returnBook(joke2, joke2.borrowBooks.get(0));
        System.out.println("after return book ");
        joke2.displayBorrowBook();






    }
}
