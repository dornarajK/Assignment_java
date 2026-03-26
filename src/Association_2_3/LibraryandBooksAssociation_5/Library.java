package Association_2_3.LibraryandBooksAssociation_5;



import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);

    }

    public String displayBook(){
        StringBuilder result = new StringBuilder();
        int index = 1;

        for(Book item : books){
            result.append(index)
                    .append(". ")
                    .append("Title:")
                    .append(item.title)
                    .append(", Author:")
                    .append(item.author)
                    .append(", Year:")
                    .append(item.year)
                    .append(", Rating:")
                    .append(item.rating)
                    .append(", review:")
                    .append(item.review)
                    .append("\n");
            index ++;
        }
        return result.toString();

    }

    public String findBookByAuthor(String author){
        for (Book book: books){
            if(book.author.equalsIgnoreCase(author)){
                return "Title: " + book.title + ", Year:"+ book.year;
            }
        }
        return "No book fund: " + author;

    }

    public Book borrowBook(String title){
        for( int i = 0; i < books.size(); i ++) {
            if(books.get(i).title.equals(title)){
                return books.remove(i);
            }

        }
        return null;
    }

    public void returnBook(Book book){
        books.add(book);
    }

    public boolean isBookAvailable(String title){
        for (Book book : books) {
            if (book.title.equals(title)) {
                return true;
            }
        }
        return false;
    }

    double average;

    public double getAverageBookRating(){
        double total = 0.0;
        for (Book book: books){
            total += book.rating;

        }
        average = total/books.size();

        return average;
    }

    public Book GetMostReviewBook(){
        if(books.isEmpty()){
            return null;
        }
        Book mostReviewed = books.get(0);

        for (Book book: books){
            if(book.review.size() > mostReviewed.review.size()){
                mostReviewed = book;
            }
        }
        return mostReviewed;
    }



}
