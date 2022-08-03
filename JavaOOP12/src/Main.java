public class Main {
    public static void menu(){
        System.out.println("""
                VEHICLE MANAGEMENT SYSTEM
                1. Add
                2. Search
                3. Exit
                """);
    }
    public static void main(String[] args) {
        Validate v = new Validate();
        Option op = new Option();

        int choice;
        while (true){
            menu();
            choice = v.getInt("Enter Choice: ", 1, 3);
            switch (choice){
                case 1:
                    int type = v.getInt("Enter Type Of Vehicle(0-Car;1-Motorbike;2-Truck): ", 0, 2);
                    op.addVehicle(type);
                    break;
                case 2:
                    op.search();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}