public class PrintedBook extends Book
{
    private int pages;

    public PrintedBook(String title, String author)
    {
        super(title, author);
    }

    /**
     *@return int number of pages 
    */
    public int getPages()
    {
        return pages;
    }

    /**
     * This is the abstract getLoanPeriod method
     * @return int 14 days
     */
    @Override
    public int getLoanPeriod()
    {
        return 14;
    }
}