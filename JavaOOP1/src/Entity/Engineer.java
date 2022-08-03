package Entity;

public class Engineer extends CanBo{
    private String specification;

    public Engineer(String specification) {
        this.specification = specification;
    }

    public Engineer(String name, int age, int gender, String address, String specification) {
        super(name, age, gender, address);
        this.specification = specification;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", gender=" + super.getGender() +
                ", address='" + super.getAddress() + '\'' +
                ", specification'" +specification+
                '}';
    }
}
