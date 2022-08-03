public class Main {
    public static void menu(){
        System.out.println("--------HOTEL MANAGEMENT SYSTEM--------\n" +
                "1. Add New Customer. \n" +
                "2. Delete Customer. \n" +
                "3. Calculate Room Charge. \n" +
                "4. Exit.");
    }
    public static void main(String[] args) {
        Validate v = new Validate();
        Option op = new Option();
        int choice;
        while (true){
            menu();
            choice = v.getInt("Enter Your Choice: ",1,4);
            switch (choice){
                case 1 :
                    op.addCustomer();
                    break;
                case 2:
                    op.delCustomer();
                    break;
                case 3:
                    op.calculate();
                    break;
                case 4:
                    System.exit(0);

            }
        }
    }
}