/**
 * Member
--------------------------
- memberId
- name
- borrowedBooks
 * private ArrayList<Book> borrowedBooks;
 */

import java.util.ArrayList;

public class Member
{
    private static int nextId = 1;
    private final int memberId;
    private final String name;

    private ArrayList<Book> borrowedBooks;

    public Member(String name)
    {
        this.name = name;
        borrowedBooks = new ArrayList<>();

        this.memberId = nextId;
        nextId++;
    }

    /**
     * This is the getter method for name
     * @return String name
     */
    public String getName()
    {
        return name;
    }

    /**
     * This is the getter method for id
     * @return int id
     */
    public int getId()
    {
        return memberId;
    }

    /**
     * This is the getter method of the borrowed books
     * @return Array list of books
     */
    public ArrayList<Book> borrowedBooks()
    {
        return borrowedBooks;
    }

    /**
     * This is the addBorrowedBook method. adds a book to the list of borrowed books
     * @param Book Borrowed book
     */
    public void addBorrowedBook(Book book)
    {
        borrowedBooks.add(book);
    }

    /**
     * This is the remove borrowed book method
     * @param Book book
     */
    public void removeBorrowedBook(Book book)
    {
        borrowedBooks.remove(book);
    }

    /**
     * This is the getter method for the borrowed books list
     * @return ArrayList of borroed book objects
     */
    public ArrayList<Book> getBorrowedBooks()
    {
        return borrowedBooks;
    }

    /**
     * This is the display borrowed books method wjich displays the list.
     */
    public void displayBorroewdBooks()
    {
        for (Book book : getBorrowedBooks())
        {
            book.displayBook();
        }
    }

    /**
     * This is the tostring method fot the member class
     * @return String toString
     */
    @Override
    public String toString()
    {
        return "Name: " + name + " Id: " + memberId;
    }



}