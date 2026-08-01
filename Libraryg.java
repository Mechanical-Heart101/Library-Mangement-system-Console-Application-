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
     * This is the add method for printed book objects
     * @param String title
     * @param String author
     */
    public void addPrintedBook(String title, String author)
    {
        Book newBook = new PrintedBook(title, author);

        int newBookId = newBook.getId();

        if (findBookById(newBookId) == null)
        {
            books.add(newBook);
        }
        else
        {
            System.out.println("This book already exists!");
        }
    }

    /**
     * This is the add method for Ebooks
     * @param String title
     * @param String author
     */
    public void addEBook(String title, String author, double fileSize)
    {
        Book newEBook = new Ebook(title, author, fileSize);

        int EBookId = newEBook.getId();

        if (findBookById(EBookId) == null)
        {
            books.add(newEBook);
        }
        else
        {
            System.out.println("This book already exists!");
        }
    }


    /**
     * This is the method that adds a member to the list memebers
     * @param String member name
     */
    public void addMember(String name)
    {
        Member newMember = new Member(name);

        int memberId = newMember.getId();

        if (findMemberById(memberId) == null)
        {
            members.add(newMember);
        }
        else
        {
            System.out.println("This member already exists!");
        }    

    }

    /**
     * This method finds a book object using its id
     * @param int id of the book
     * @return Book found 
     */
    public Book findBookById(int id)
    {
        Book foundBook = null;
        for (Book book : books)
        {
            if (book.getId() == id)
            {
                foundBook = book;
            }
        }
        if (foundBook == null)
        {
            System.out.println("Book not found!");
        }
        return foundBook;  
    }


    /**
     * This method finds a member object using its unique id
     * @param int id of the member
     */
    public Member findMemberById(int id)
    {
        Member foundMember = null;

        for (Member member : members)
        {
            if (member.getId() == id)
            {
                foundMember = member;
            }
        }

        if (foundMember == null)
        {
            System.out.println("Member not found!");
        }
        return foundMember;
    }

    /**
     * This is the remove method for books
     * @param int book id
     */
    public void removeBook(int id)
    {
        Book bookToRemove = findBookById(id);

        if (bookToRemove == null)
        {
            System.out.println("This book dous not exist!");
        }
        else
        {
            books.remove(bookToRemove);
        }
    }

    /**
     * This is them method for reomoving members from the list of members
     * @param int member id
     */
    public void removeMember(int id)
    {
        Member memberRemove = findMemberById(id);

        if (memberRemove == null)
        {
            System.out.println("This member does not exist!");
        }
        else
        {
            members.remove(memberRemove);
        }
    }




}