package entity;

import java.util.ArrayList;

public abstract class Employee {
    protected String ID;
    protected String fullname;
    protected String birthday;
    protected String phone;
    protected String email;
    protected int employee_type;
    protected ArrayList<Certificate> list = new ArrayList<>();//HAS-A
    protected static long employee_count = 0;

    public Employee() {
    }

    public Employee(String ID, String fullname, String birthday, String phone, String email, int employee_type) {
        this.ID = ID;
        this.fullname = fullname;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.employee_type = employee_type;
    }

    public Employee(String ID, String fullname, String birthday, String phone, String email, int employee_type, ArrayList<Certificate> list) {
        this.ID = ID;
        this.fullname = fullname;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.employee_type = employee_type;
        this.list = list;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmployee_type() {
        return employee_type;
    }

    public void setEmployee_type(int employee_type) {
        this.employee_type = employee_type;
    }

    public ArrayList<Certificate> getList() {
        return list;
    }

    public void setList(ArrayList<Certificate> list) {
        this.list = list;
    }

    public static long getEmployee_count() {
        return employee_count;
    }

    public abstract void showInfo() ;
}
