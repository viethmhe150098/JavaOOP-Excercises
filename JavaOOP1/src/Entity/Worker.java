package Entity;

public class Worker extends CanBo{
    private int level;

    public Worker(int level) {
        this.level = level;
    }

    public Worker(String name, int age, int gender, String address, int level) {
        super(name, age, gender, address);
        if(level>=1&&level<=10) {
            this.level = level;
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", gender=" + super.getGender() +
                ", address='" + super.getAddress() + '\'' +
                ", level='" +level+
                '}';
    }
}
