public class Book {

    public static final String DEFAULT_TITLE = AuthorBookConstants.UNKNOWN_TITLE;
    public static final int DEFAULT_PUBLICATION = AuthorBookConstants.UNKNOWN_YEAR;
    public static final Author DEFAULT_AUTHOR = AuthorBookConstants.UNKNOWN_AUTHOR;
    public static final String DEFAULT_ISBN = AuthorBookConstants.UNKNOWN_ISBN;

    private String title;
    private Author author;
    private int year;
    private String isbn;

    public Book(String title, Author author){
        this.title = title;
        this.author = author;
    }
    public Book(String title){
        this.title = title;
        this.author = DEFAULT_AUTHOR;
//        this.year = DEFAULT_PUBLICATION;
//        this.isbn = DEFAULT_ISBN;
    }
    public Book(){
        this.title = DEFAULT_TITLE;
        this.author = DEFAULT_AUTHOR;
//        this.year = DEFAULT_PUBLICATION;
//        this.isbn = DEFAULT_ISBN;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setAuthor(Author author){
        this.author = author;
    }

    public Author getAuthor(){
        return author;
    }


}
