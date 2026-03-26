package Association_2_3.LibraryandBooksAssociation_6;

import java.util.ArrayList;

public class User {
    String name;
    int age;
    ArrayList <Book> borrowed;

    public User(String name, int age){
        this.name = name;
        this.age = age;
        this.borrowed = new ArrayList<>();
    }

    public void borrowBooks(Book book){
        this.borrowed.add(book);
    }

    public void returnBooks(Book book){
        this.borrowed.remove(book);
    }

    public void displayBorrowBook(){
        if(borrowed.isEmpty()) {
            System.out.println(name + "has not borrow book");
        }
        for(Book book: borrowed){
            System.out.println("- "+ book.title);
        }
    }

}
