public class Newspaper extends Document{
    private int publish_date;

    public Newspaper(String id, String publisher, int number, int publish_date) {
        super(id, publisher, number);
        this.publish_date = publish_date;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "publish_date=" + publish_date +
                ", id='" + id + '\'' +
                ", publisher='" + publisher + '\'' +
                ", number=" + number +
                "} " + super.toString();
    }
}
