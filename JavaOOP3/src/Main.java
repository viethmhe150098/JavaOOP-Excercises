import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Option op = new Option();

        while (true){
            System.out.println("1. Add New Student \n" +
                    "2. Search By ID \n" +
                    "3. Show \n" +
                    "4. Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.print("Enter Type Student: ");
                    int type = Integer.parseInt(sc.nextLine());
                    op.add(type);
                    break;
                case 2:
                    op.search();
                    break;
                case 3:
                    op.show();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}