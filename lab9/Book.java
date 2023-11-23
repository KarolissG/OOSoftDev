class Book extends LibraryItem {
    private String author;
    private String title;
    private int numPages;

    public Book(String type, String ID, String author, String title, int pages) {
        super(type, ID);
        this.author = author;
        this.title = title;
        this.numPages = pages;
    }

    public String toString() {
        return super.toString() + "\nAuthor :" + author + "\nTitle :" + title + "\nPages :" + numPages;
    }
}
