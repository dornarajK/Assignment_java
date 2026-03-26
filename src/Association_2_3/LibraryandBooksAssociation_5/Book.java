package Association_2_3.LibraryandBooksAssociation_5;

import java.util.ArrayList;

public class Book {
    String title;
    String author;
    Integer year;
    double rating;
    ArrayList <String> review;


    public Book(String title, String author, Integer year){
        this.title = title;
        this.author = author;
        this.year = year;
        this.rating = 0.0;
        this.review = new ArrayList<>();
    }

    public void setRating(double rating){
        this.rating = rating;
    }

    public void addReview(String review){
       this.review.add(review);
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + year + ")";
    }



}
