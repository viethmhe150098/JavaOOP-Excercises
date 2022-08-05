package entity;

import java.util.ArrayList;

public class Experience extends Employee{
    private int expInYear;
    private String proSkill;

    public Experience(int expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public Experience(String ID, String fullname, String birthday, String phone, String email, int employee_type, int expInYear, String proSkill) {
        super(ID, fullname, birthday, phone, email, employee_type);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public Experience(String ID, String fullname, String birthday, String phone, String email, int employee_type, ArrayList<Certificate> list, int expInYear, String proSkill) {
        super(ID, fullname, birthday, phone, email, employee_type, list);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", fullname='" + fullname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", employee_type=" + employee_type +
                ", list=" + list +'\''+
                ", expInYear="+ expInYear +'\''+
                ", proSkill="+ proSkill +'\''+
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }
}
