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


}