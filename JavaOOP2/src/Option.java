import entity.Customer;
import entity.RoomA;
import entity.RoomB;
import entity.RoomC;

import java.util.ArrayList;

public class Option {
    Validate v = new Validate();
    private static final String STRING_PATTERN = "^[a-zA-Z ]+$";
    private static final String STRING_PATTERN_ALL = "^[a-zA-Z0-9 ]+$";
    private static final String STRING_PATTERN_ROOM = "^[ABC]$";
    ArrayList<Customer> list = new ArrayList<>();

    public void addCustomer(){
        String name = v.getString("Enter Customer Name: ", STRING_PATTERN);
        String idNumbers = v.getString("Enter Customer ID Numbers: ", STRING_PATTERN_ALL);
        int rentDate = v.getInt("Enter Number Of Rental Days: ", 0, Integer.MAX_VALUE);
        String roomType = v.getString("Enter Room Type(A-500$,B-300$,C-100$):", STRING_PATTERN_ROOM);
        System.out.println();
        switch (roomType){
            case "A":
                list.add(new Customer(name, idNumbers, rentDate, new RoomA()));
                break;
            case "B":
                list.add(new Customer(name, idNumbers, rentDate, new RoomB()));
                break;
            case "C":
                list.add(new Customer(name, idNumbers, rentDate, new RoomC()));
                break;
        }
    }

    public void delCustomer(){
        while(true){
            String idNumber = v.getString("Enter Customer ID Numbers: ", STRING_PATTERN_ALL);
            Customer cus = list.stream().filter(c -> c.getIdNumbers().equals(idNumber)).findFirst().orElse(null);
            if(cus!=null){
                list.remove(cus);
                System.out.println("Delete Successfully. \n");

                break;
            }
            System.out.println("No ID Match. \n");
        }
    }

    public void calculate(){
        while(true){
            String idNumber = v.getString("Enter Customer ID Numbers: ", STRING_PATTERN_ALL);
            Customer cus = list.stream().filter(c -> c.getIdNumbers().equals(idNumber)).findFirst().orElse(null);
            if(cus!=null){
                long result = cus.getRoom().getPrice()*cus.getRentDate();
                System.out.println("Total Price: "+result+"\n");
                break;
            }
            System.out.println("No ID match. \n");
        }
    }
}
