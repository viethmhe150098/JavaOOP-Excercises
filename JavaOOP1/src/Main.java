public class Main {
    public static void menu(){
        System.out.println("""
                CANDIDATE MANAGEMENT SYSTEM
                1. Add
                2. Searching
                3. Display
                4. Exit""");
    }
    public static void main(String[] args) {
        Option op = new Option();
        Validate v = new Validate();
        int choice;

        while(true){
            menu();
            choice = v.getInt("Enter Choice: ", 1, 4);
            switch (choice) {
                case 1 -> {
                    int type = v.getInt("Enter Type Of Candidate(0-Employee;1-Engineer;2-Worker): ", 0, 2);
                    op.addCandidate(type);
                }
                case 2 -> op.search();
                case 3 -> op.display();
                case 4 -> System.exit(0);
            }
        }
    }
}