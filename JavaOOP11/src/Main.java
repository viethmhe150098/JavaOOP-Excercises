import java.util.Scanner;

public class Main {
    public static Complex add(Complex c1, Complex c2){
        Complex temp = new Complex();
        temp.setReal(c1.getReal()+c2.getReal());
        temp.setImg(c1.getImg()+c2.getImg());
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Complex Number 1 Real: ");
        double real1 = Double.parseDouble(sc.nextLine());
        System.out.print("Enter Complex Number 2 Img: ");
        double img1 = Double.parseDouble(sc.nextLine());
        Complex c1 = new Complex(real1, img1);
        c1.show();
        System.out.println();
        System.out.print("Enter Complex Number 2 Real: ");
        double real2 = Double.parseDouble(sc.nextLine());
        System.out.print("Enter Complex Number 2 Img: ");
        double img2 = Double.parseDouble(sc.nextLine());
        Complex c2 = new Complex(real2, img2);
        c2.show();
        System.out.println();
        System.out.print("sum: ");
        add(c1,c2).show();
    }
}