package Association_2_3.LibraryandBooksAssociation_1;

public class Book {
    String title;
    String author;
    Integer year;


    public Book(String title, String author, Integer year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
    @Override
    public String toString() {
        return title + " by " + author + " (" + year + ")";
    }


}
