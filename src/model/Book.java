package model;

public class Book extends Publication {
    private String author;
    private int pages;
    private String isbn;

    public Book(String title, String author, int year, int pages, String publisher, String isbn) {
        super(title, publisher, year);

        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }


    // settery i gettery
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void printInfo() {
        String info = getTitle() + "; " + author + "; " + getYear() + "; "
                + pages + "; " + getPublisher() + "; " + isbn;
        System.out.println(info);
    }
}