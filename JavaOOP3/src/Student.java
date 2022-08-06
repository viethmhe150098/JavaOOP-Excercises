public class Student {
    protected String id;
    protected String fullname;
    protected String address;
    protected int prority;

    public Student(String id, String fullname, String address, int prority) {
        this.id = id;
        this.fullname = fullname;
        this.address = address;
        this.prority = prority;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
