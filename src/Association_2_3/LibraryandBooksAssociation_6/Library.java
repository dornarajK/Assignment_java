package Association_2_3.LibraryandBooksAssociation_6;



import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books = new ArrayList<>();
    private final ArrayList<User> users = new ArrayList<>();

    public void addUser(User user){
        users.add(user);
    }

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

    public void borrowBookByUser(User user, String title ){
        Book book = borrowBook(title);
        if(book != null ){
            user.borrowBooks(book);
            System.out.println(user.name +" brrowed: " + title);
        }else {
            System.out.println("book not found");
        }

    }

    public void returnBook(User joku1, Book book){
        books.add(book);
    }
    public void returnBookByUser( User user, Book book){
        user.returnBooks(book);
        returnBook(user, book);
        System.out.println();
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
