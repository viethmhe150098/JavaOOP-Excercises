import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Option {
    Scanner sc = new Scanner(System.in);

    ArrayList<Student> list = new ArrayList<>();
    public void add(int type){
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Fullname: ");
        String fullname = sc.nextLine();
        System.out.print("Enter address");
        String address = sc.nextLine();
        System.out.print("Enter Prority Level: ");
        int prority = Integer.parseInt(sc.nextLine());

        switch (type){
            case 1:
                list.add(new StudentA(id, fullname, address, prority));
                break;
            case 2:
                list.add(new StudentB(id, fullname, address, prority));
                break;
            case 3:
                list.add(new StudentC(id, fullname, address, prority));
                break;
        }
    }

    public void search(){
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        Student stu = list.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
        if(stu != null){
            System.out.println(stu);
        }else{
            System.out.println("Id not match");
        }
    }

    public void show(){
        list.stream().forEach(System.out::println);
    }
}
