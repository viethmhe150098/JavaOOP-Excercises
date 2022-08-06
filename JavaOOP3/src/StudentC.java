public class StudentC extends Student {
    //Literature, History, Geography
    private static final String Literature = "Literature";
    private static final String History = "History";
    private static final String Geography = "Geography";

    public StudentC(String id, String fullname, String address, int prority) {
        super(id, fullname, address, prority);
    }

    @Override
    public String toString() {
        return "StudentA{" +
                "id='" + id + '\'' +
                ", fullname='" + fullname + '\'' +
                ", address='" + address + '\'' +
                ", prority=" + prority + '\''+
                ", subject=" + Literature + "," + History + ","+Geography +'\''+
                "} " + super.toString();
    }
}
