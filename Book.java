public class Book {
    int bookID;
    String title;
    String author;
    boolean isAvailable;

    //Constructor to initialize book attributes
    public Book(int bookID, String title, String author)
    {
        this.bookID= bookID;
        this.title= title;
        this.author=author;

    }

    public int  getBookID()
    {
          return bookID;
    }

    public String gettitle()
    {
        return title;

    }

    public String getauthor()
    {
        return author;
    }
    
    public boolean isAvailable()
    {
        return isAvailable;
    }
    public void setAvailability(boolean availability) {
        isAvailable = availability;
    }
}



