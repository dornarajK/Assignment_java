package StaticsPackages_3_3.library.system;
//Create a Library class inside the system package.
// This class should manage the library's books and members. Implement
// methods to add books, add members, borrow books, and return books.

import Association_2_3.LibraryandBooksAssociation_6.User;
import StaticsPackages_3_3.library.model.Book;
import StaticsPackages_3_3.library.model.LibraryMember;

import java.lang.reflect.Member;
import java.util.ArrayList;


public class Library {
    private final ArrayList<Book> books = new ArrayList<>();
    private final ArrayList<LibraryMember> members = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);

    }

    public void addMember(LibraryMember member){
        members.add(member);
    }

    public Book borrow(String title){
        for (int i = 0; i < books.size(); i ++){
            if(books.get(i).title.equals(title)){
                return books.remove(i);
            }
        }
        return null;
    }

    public void borrowBook(LibraryMember member, String title){
        Book book = borrow(title);
        if (book != null){
            member.addBrowBook(book);
            System.out.println(member.name +" brrowed: " + title);
        }else {
            System.out.println("book now found");
        }
    }

    public void returnBrowBook(Book book){
        books.add(book);
    }

    public void returnBook(LibraryMember member, Book book){
        member.returnBrowBook(book);
        returnBrowBook(book);
        System.out.println();
    }


}
