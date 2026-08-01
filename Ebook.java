public class Ebook extends Book
{
    private double fileSize;

    public Ebook(String title, String author, double fileSize)
    {
        super(title, author);
        this.fileSize = fileSize;
    }

    /**
     * This method reutrns the size of the Ebook
     * @return double size of file
     */
    public double getFileSize()
    {
        return fileSize;
    }

    /**
     * This is the getloanPeroid method
     * @return 30 days
     */
    @Override
    public int getLoanPeriod()
    {
        return 30;
    }

}