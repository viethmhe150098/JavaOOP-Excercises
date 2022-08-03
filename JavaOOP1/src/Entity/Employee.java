package Entity;

public class Employee extends CanBo{
    private String jobTitle;

    public Employee(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Employee(String name, int age, int gender, String address, String jobTitle) {
        super(name, age, gender, address);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", gender=" + super.getGender() +
                ", address='" + super.getAddress() + '\'' +
                ", job title='" +jobTitle+
                '}';
    }
}
