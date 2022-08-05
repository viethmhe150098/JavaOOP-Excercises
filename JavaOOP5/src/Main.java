import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Option op = new Option();

        while(true){
            System.out.println("Application Manager Document \n" +
                    "1. Add new document(1. Book ; 2. Magazine; 3. Newspaper) \n" +
                    "2. Delete document \n" +
                    "3. Display all document \n" +
                    "4. Search document by category (1. Book ; 2. Magazine; 3. Newspaper) \n" +
                    "5. Exit");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.print("Enter Category: ");
                    int type = Integer.parseInt(sc.nextLine());
                    op.add(type);
                    break;
                case 2:
                    op.delete();
                    break;
                case 3:
                    op.show();;
                    break;
                case 4:
                    System.out.print("Enter Category: ");
                    int cate = Integer.parseInt(sc.nextLine());
                    op.searchType(cate);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}