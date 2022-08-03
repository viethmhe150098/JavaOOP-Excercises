package entity;

import java.util.ArrayList;

public class Fresher extends Employee{
    private String graduation_date;
    private int graduation_rank;
    private String education;

    public Fresher(String graduation_date, int graduation_rank, String education) {
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.education = education;
    }

    public Fresher(String ID, String fullname, String birthday, String phone, String email, int employee_type, ArrayList<Certificate> list, String graduation_date, int graduation_rank, String education) {
        super(ID, fullname, birthday, phone, email, employee_type, list);
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.education = education;
    }

    public String getGraduation_date() {
        return graduation_date;
    }

    public void setGraduation_date(String graduation_date) {
        this.graduation_date = graduation_date;
    }

    public int getGraduation_rank() {
        return graduation_rank;
    }

    public void setGraduation_rank(int graduation_rank) {
        this.graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
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
                ", majors="+ graduation_date +'\''+
                ", semester="+ graduation_rank +'\''+
                ", university_name=" + education +'\''+
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }
}
