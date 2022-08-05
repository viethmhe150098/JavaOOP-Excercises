import java.util.*;

public class Option {
    Scanner sc = new Scanner(System.in);
    ArrayList<Document> list = new ArrayList<>();

    public void add(int type){
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        System.out.print("Enter publishing company: ");
        String publisher = sc.nextLine();
        System.out.print("Enter number of release: ");
        int number = Integer.parseInt(sc.nextLine());
        switch (type) {
            case 1 -> {//book
                System.out.print("Enter author's name: ");
                String author = sc.nextLine();
                System.out.print("Enter number of page: ");
                int page = Integer.parseInt(sc.nextLine());
                list.add(new Book(id, publisher, number, author, page));
            }
            case 2 -> { //magazine
                System.out.print("Enter publish number: ");
                int publish_num = Integer.parseInt(sc.nextLine());
                System.out.print("Enter publish month: ");
                int publish_mon = Integer.parseInt(sc.nextLine());
                list.add(new Magazine(id, publisher, number, publish_num, publish_mon));
            }
            case 3 -> {//newspaper
                System.out.print("Enter publish date: ");
                int publish_date = Integer.parseInt(sc.nextLine());
                list.add(new Newspaper(id, publisher, number, publish_date));
            }
        }
    }

    public void delete(){
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        Document doc = list.stream().filter(d->d.getId().equals(id)).findFirst().orElse(null);
        if(doc!=null){
            list.remove(doc);
            System.out.println("Delete successfully");
        }else{
            System.out.println("Can't find ID");
        }
    }

    public void show(){
        list.forEach(d-> System.out.println(d.toString()));
    }

    public void searchType(int type){
        switch (type) {
            case 1 -> list.stream().filter(d -> d instanceof Book).forEach(System.out::println);
            case 2 -> list.stream().filter(d -> d instanceof Magazine).forEach(System.out::println);
            case 3 -> list.stream().filter(d -> d instanceof Newspaper).forEach(System.out::println);
        }

    }
}
