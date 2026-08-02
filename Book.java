
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
    private int id; // default 0
    private final String title;
    private final String author;
    private boolean available;

    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;

        this.available = true; 
        this.id = nextId;
        nextId++;
    }

    /**
     * This is the getter method for id. It is meant to serve as a helper method.
     * @return int id of the book
     */
    public int getId()
    {
        return id;
    }

    /**
     * This is the getter method for title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * This is the getter method for author
     */
    public String getAuthor()
    {
        return author;
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
     *
     * @return
     */
    public abstract int getLoanPeriod();


    /**
     * This method checks availablility
     * 
     * @return Boolean true or false check for availability
     */
    public Boolean isAvailable()
    {
        return available;
    }

    /**
     * This is the toString method for the Book class
     * @return String toString 
     */
    @Override
    public String toString()
    {
        return "Title: "+ title + " Author: "+ author
            + " Id: " + id + " Available: " + available;
    }

}