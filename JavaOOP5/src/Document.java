public class Document {
    protected String id;
    protected String publisher;
    protected int number;

    public Document(String id, String publisher, int number) {
        this.id = id;
        this.publisher = publisher;
        this.number = number;
    }
    public String getId() {
        return id;
    }

}
