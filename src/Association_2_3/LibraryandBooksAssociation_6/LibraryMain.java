package Association_2_3.LibraryandBooksAssociation_6;


public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);
        User joku1 = new User("joku", 30);
        User joku2 = new User("joku2", 10);

        library.addUser(joku1);
        library.addUser(joku2);

        book2.setRating(3.5);
        book3.addReview("Good book");
        book3.addReview("Nice book");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Library Catalog:");
        System.out.println(library.displayBook());

        System.out.println("Average rating " + library.getAverageBookRating());

        System.out.println("most reviewed book");
        Book most = library.GetMostReviewBook();
        System.out.println(most.title);

        System.out.println("users borrowing books: ");

        library.borrowBookByUser(joku1, "The Art of Fiction");
        library.borrowBookByUser(joku2, "Data Structures and Algorithms");
        System.out.println("user returns a book");
        library.returnBookByUser(joku1, joku1.borrowed.get(0));
        joku1.displayBorrowBook();







    }

}
