import java.util.ArrayList;
import java.util.Scanner;

public class Option {
    Scanner sc = new Scanner(System.in);
    Validate v = new Validate();

    ArrayList<Vehicle> list = new ArrayList<>();
    private static final String STRING_PATTERN_ALL = "^[a-zA-Z0-9 ]+$";

    public void addVehicle(int type){

        String id = v.getString("Enter vehicle ID: ", STRING_PATTERN_ALL);
        String madeBy = v.getString("Enter Producer: ", STRING_PATTERN_ALL);
        int yearOfManu = v.getInt("Enter Year Of Manufacture: ",1800, 2022);
        double price = Double.parseDouble(sc.nextLine());
        String color = v.getString("Enter Color: ", STRING_PATTERN_ALL);
        switch (type){
            case 0:
                int seat = v.getInt("Enter Seat: ", 4, Integer.MAX_VALUE);
                String engineType = v.getString("Enter Engine Type: ", STRING_PATTERN_ALL);
                list.add(new Car(id, madeBy, yearOfManu, price, color, seat, engineType));
                break;
            case 1:
                int wattage = v.getInt("Enter Wattage: ", 0, Integer.MAX_VALUE);
                list.add(new MotorBike(id, madeBy, yearOfManu, price, color, wattage));
                break;
            case 2:
                int payload = v.getInt("Enter Payload: ", 0, Integer.MAX_VALUE);
                list.add(new Truck(id, madeBy, yearOfManu, price, color, payload));
                break;

        }
    }

    public void deleteID(){
        String id = v.getString("Enter ID: ", STRING_PATTERN_ALL);
        Vehicle vehicle = list.stream().filter(v->v.getId().equals(id)).findFirst().orElse(null);
        if(vehicle!=null){
            list.remove(vehicle);
        }else{
            System.out.println("ID Not Matches. ");
        }
    }

    public void search(){
        String id = v.getString("Enter ID: ", STRING_PATTERN_ALL);
        Vehicle ve = list.stream().filter(v->v.getId().equals(id)).findFirst().orElse(null);
        if(ve!=null){
            System.out.println(ve);
        }else{
            System.out.println("ID Not Matches. ");
        }
    }
}
