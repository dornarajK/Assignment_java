package Association_2_3.LibraryandBooksAssociation_1;


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



}
