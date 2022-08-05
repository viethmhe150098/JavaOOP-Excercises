public class Magazine extends Document{
    private int publish_num;
    private int publish_month;

    public Magazine(String id, String publisher, int number, int publish_num, int publish_month) {
        super(id, publisher, number);
        this.publish_num = publish_num;
        this.publish_month = publish_month;
    }

    public int getPublish_num() {
        return publish_num;
    }

    public void setPublish_num(int publish_num) {
        this.publish_num = publish_num;
    }

    public int getPublish_month() {
        return publish_month;
    }

    public void setPublish_month(int publish_month) {
        this.publish_month = publish_month;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "publish_num=" + publish_num +
                ", publish_month=" + publish_month +
                ", id='" + id + '\'' +
                ", publisher='" + publisher + '\'' +
                ", number=" + number +
                "} " + super.toString();
    }
}
