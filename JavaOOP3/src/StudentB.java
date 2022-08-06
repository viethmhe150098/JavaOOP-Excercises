public class StudentB extends Student {
    //Math, Chemistry, Biology
    private static final String MATH = "Math";
    private static final String Biology = "Biology";
    private static final String Chemistry = "Chemistry";

    public StudentB(String id, String fullname, String address, int prority) {
        super(id, fullname, address, prority);
    }

    @Override
    public String toString() {
        return "StudentA{" +
                "id='" + id + '\'' +
                ", fullname='" + fullname + '\'' +
                ", address='" + address + '\'' +
                ", prority=" + prority + '\''+
                ", subject=" + MATH + "," + Biology + ","+Chemistry +'\''+
                "} " + super.toString();
    }
}
