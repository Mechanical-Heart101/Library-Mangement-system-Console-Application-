
/**
 *                  Book (abstract)
      ---------------------------------
      - id
      - title
      - author
      - available
      + borrow()
      + returnBook()
      + displayInfo()
      + getLoanPeriod()   <-- abstract
 * 
 */

public abstract class Book
{
    private static int nextId = 1;
    private final String title;
    private final String author;
    private Boolean  available;

    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;

        this.id = id + 1;
        this.available = true; 
    }

    /**
     * This is the getter method for id. It is meant to serve as a helper method.
     * @param String title of the book
     */
    public int getId(String title)
    {
        return id;
    }

    /**
     * This is the borrow method for the book
     */
    public void borrowBook()
    {
        available = false;
    }

    /**
     * This is the return method for the book
     */
    public void returnBook()
    {
        available = true;
    }

    /**
     * This is the display info method for the book objects
     * This method prints out the characteristics of the book
     */
    public void displayBook()
    {
        System.out.println(title);
        System.out.println(author);
        System.out.println(id);
        System.out.println(available);
    }

    /**
     * This is the abstract method for books 
     * @param title
     * @return
     */
    public abstract int getLoanPeriod(String title);

}