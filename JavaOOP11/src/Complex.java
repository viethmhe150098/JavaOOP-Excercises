public class Complex {
    private double real;
    private double img;

    public Complex() {
    }

    public Complex(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImg() {
        return img;
    }

    public void setImg(double img) {
        this.img = img;
    }

    public void show(){
        System.out.printf("%.1f + %.1fi ", this.real,this.img);
    }
}
