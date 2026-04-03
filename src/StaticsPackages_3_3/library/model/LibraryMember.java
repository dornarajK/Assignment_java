package StaticsPackages_3_3.library.model;

import java.util.ArrayList;

public class LibraryMember {
     public String name;
     int memberId;
    public ArrayList <Book> borrowBooks;

    public LibraryMember ( String name, int memberId){
        this.name = name;
        this.memberId = memberId;
        this.borrowBooks = new ArrayList<>();
    }

    public void addBrowBook(Book book){
        this.borrowBooks.add(book);
    }

    public void returnBrowBook(Book book){
        this.borrowBooks.remove(book);
    }

    public void displayBorrowBook(){
        if(borrowBooks.isEmpty()){
            System.out.println(name + " has not borrow a book");
        }
        for (Book book: borrowBooks){
            System.out.println("- "+ book.title);
        }

    }


}
