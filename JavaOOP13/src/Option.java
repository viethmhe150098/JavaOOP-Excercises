import entity.Employee;
import entity.Experience;

import java.util.ArrayList;

public class Option {
    Validate v = new Validate();

    private final String STRING_PATTERN_ALL = "^[a-zA-Z0-9 ]+$";
    private final String STRING_PATTERN = "^[a-zA-Z ]+$";
    private final String STRING_PATTERN_PHONE="^[0-9]+$";
    private final String STRING_PATTERN_EMAIL = "[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z]+(\\.[a-zA-Z]){1,}";
    ArrayList<Employee> list = new ArrayList<>();
    public boolean checkID(String id){
        Employee emp = list.stream().filter(e -> e.getID().equals(id)).findFirst().orElse(null);
        if(emp!=null){
            return true;
        }else{
            return false;
        }
    }

    public void addEmployee(int type){
        String id;
        while (true){
            id = v.getString("Enter Employee ID: ",STRING_PATTERN_ALL);
            if(!checkID(id)){
                break;
            }
        }
        String fullname = v.getString("Enter Employee Name: ", STRING_PATTERN);
        String birthday = v.getDate("Enter Employee Birthday: ");
        String phone = v.getString("Enter Employee Phone Number: ", STRING_PATTERN_PHONE);
        String email = v.getString("Enter Employee Email: ",STRING_PATTERN_EMAIL);
        switch (type){
            case 0:
                int expinyear = v.getInt("Enter Year Of Experience: ", 0, 100);
                String proSkill = v.getString("Enter Professional Skill: ", STRING_PATTERN);
                list.add(new Experience(id, fullname, birthday, phone, email, type, expinyear, proSkill));
                break;
            case 1:
                String graduation_date=v.getString("Enter Year Of Graduation: ", )

        }
    }
}
