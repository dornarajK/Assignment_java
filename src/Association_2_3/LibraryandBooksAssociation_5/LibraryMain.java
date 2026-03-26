package Association_2_3.LibraryandBooksAssociation_5;



public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

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



    }

}
