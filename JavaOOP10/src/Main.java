import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        Para p = new Para(txt);
        System.out.println(p.count());
        System.out.println(p.countA());
        System.out.println(p.standard());
    }
}