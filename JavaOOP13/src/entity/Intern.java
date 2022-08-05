package entity;

import java.util.ArrayList;

public class Intern extends Employee{
    private String majors;
    private int semester;
    private String university_name;

    public Intern(String majors, int semester, String university_name) {
        this.majors = majors;
        this.semester = semester;
        this.university_name = university_name;
    }

    public Intern(String ID, String fullname, String birthday, String phone, String email, int employee_type, String majors, int semester, String university_name) {
        super(ID, fullname, birthday, phone, email, employee_type);
        this.majors = majors;
        this.semester = semester;
        this.university_name = university_name;
    }

    public Intern(String ID, String fullname, String birthday, String phone, String email, int employee_type, ArrayList<Certificate> list, String majors, int semester, String university_name) {
        super(ID, fullname, birthday, phone, email, employee_type, list);
        this.majors = majors;
        this.semester = semester;
        this.university_name = university_name;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversity_name() {
        return university_name;
    }

    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
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
                ", majors="+ majors +'\''+
                ", semester="+ semester +'\''+
                ", university_name=" +university_name +'\''+
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }
}
