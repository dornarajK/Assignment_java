package Association_2_3.LibraryandBooksAssociation_2;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Introduction to Java Programming", "John Smith", 2020));
        library.addBook(new Book("Data Structures and Algorithms", "Jane Doe", 2018));
        library.addBook(new Book("The Art of Fiction", "Alice Johnson", 2019));

        System.out.println("Library Catalog:");
        System.out.println(library.displayBook());
        System.out.println("Books by Author \"Jane Doe\":");
        System.out.println(library.findBookByAuthor("Jane Doe"));
        System.out.println("Brow a book: The Art of Fiction");
        Association_2_3.LibraryandBooksAssociation_2.Book myBook = library.borrowBook("The Art of Fiction");
        System.out.println("Show all books");
        System.out.println(library.displayBook());
        System.out.println("return a book ");
        library.returnBook(myBook);
        System.out.println("Show all books");
        System.out.println(library.displayBook());


    }

}
