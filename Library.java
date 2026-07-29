import java.util.ArrayList;
/**
 * Class Structure:
 *     Library
             ----------------
             - books
             - members
             + addBook()
             + removeBook()
             + findBook()
             + displayBooks()
             + registerMember()
             + borrowBook()
             + returnBook()

 */

public class Library
{

    private ArrayList<Book> books; // field for book objects

    private ArrayList<Member> members; // for member objects


    /**
     * This is no argument constructor fo the Library class.
     * It initializes the lists books and members
     */
    public Library()
    {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    /**
     * This is the add method for book objects
     */
    public void addBook(String title, String author)
    {
        Book newBook = new Book(title, author);

    }

    /**
     * This is the finder method for books
     */
    public Book findBook(String title)
    {
        Book foundBook = null;
        int titleId = getId(title);

        for (Book book : books)
        {

        }

        return foundBook;
    }






}