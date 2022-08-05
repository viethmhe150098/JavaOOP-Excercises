public class Book extends Document {
    private String author;
    private int page;

    public Book(String id, String publisher, int number, String author, int page) {
        super(id, publisher, number);
        this.author = author;
        this.page = page;
    }


    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", numerPage=" + page +
                ", id='" + id + '\'' +
                ", nxb='" + publisher + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
