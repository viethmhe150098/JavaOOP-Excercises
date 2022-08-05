import Entity.CanBo;
import Entity.Employee;
import Entity.Engineer;
import Entity.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class Option {
    Scanner sc = new Scanner(System.in);
    Validate v = new Validate();
    ArrayList<CanBo> list = new ArrayList<>();
    static final String STRING_PATTERN = "^[a-zA-Z ]+$";
    static final String STRING_PATTERN_ALL= "^[a-zA-Z0-9 ]+$";
    //add new CanBo
    public void addCandidate(int type){
        String name = v.getString("Enter Name: ", STRING_PATTERN);
        int age = v.getInt("Enter Age: ", 0, Integer.MAX_VALUE);
        int gender = v.getInt("Enter Gender(1-Male;0-Female;2-Other): ",0,2);
        String address = v.getString("Enter Address: ", STRING_PATTERN_ALL);

        switch (type){
            case 0: //Employee
                String jobTitle = v.getString("Enter Employee Job Title: ", STRING_PATTERN_ALL);
                list.add(new Employee(name, age, gender, address, jobTitle));
                break;
            case 1: //Engineer
                String specialization = v.getString("Enter Engineer Specialization: ", STRING_PATTERN_ALL);
                list.add(new Engineer(name, age, gender, address, specialization));
                break;
            case 2: //Worker
                int level = v.getInt("Enter Worker Level", 1, 10);
                list.add(new Worker(name, age, gender, address, level));
                break;
        }
    }

    //search by name
    public void search(){
        String search = v.getString("Enter text: ", STRING_PATTERN);
        list.stream().filter(c -> c.getName().equals(search)).forEach(c-> System.out.println(c));
    }
    //display
    public void display(){
        list.forEach(c-> System.out.println(c));
    }
}
