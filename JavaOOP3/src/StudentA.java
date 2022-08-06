import java.util.ArrayList;

public class StudentA extends Student{
    private static final String MATH = "Math";
    private static final String Physics = "Physics";
    private static final String Chemistry = "Chemistry";

    public StudentA(String id, String fullname, String address, int prority) {
        super(id, fullname, address, prority);
    }

    @Override
    public String toString() {
        return "StudentA{" +
                "id='" + id + '\'' +
                ", fullname='" + fullname + '\'' +
                ", address='" + address + '\'' +
                ", prority=" + prority + '\''+
                ", subject=" + MATH + "," + Physics + ","+Chemistry +'\''+
                "} " + super.toString();
    }
}
