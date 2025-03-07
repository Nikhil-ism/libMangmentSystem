
public class Book{

    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn ){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getIsbn(){
        return isbn;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

   public void displayBookInfo(){
       System.out.println("Title: "+ title);
       System.out.println("Author: "+ author);
       System.out.println("ISBN: "+ isbn);
       System.out.println("----------------");

    }
}