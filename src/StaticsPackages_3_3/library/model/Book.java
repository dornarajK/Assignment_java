package StaticsPackages_3_3.library.model;

public class Book {
     public String title;
     String author;
     String ISBN;

    public Book (String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + ISBN + ")";
    }

}
