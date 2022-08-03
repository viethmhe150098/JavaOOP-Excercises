public class Vehicle {
    private String id;
    private String madeBy;
    private int yearOfManu;
    private double price;
    private String color;

    public Vehicle() {
    }

    public Vehicle(String id, String madeBy, int yearOfManu, double price, String color) {
        this.id = id;
        this.madeBy = madeBy;
        this.yearOfManu = yearOfManu;
        this.price = price;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMadeBy() {
        return madeBy;
    }

    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }

    public int getYearOfManu() {
        return yearOfManu;
    }

    public void setYearOfManu(int yearOfManu) {
        this.yearOfManu = yearOfManu;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", madeBy='" + madeBy + '\'' +
                ", yearOfManu=" + yearOfManu +
                ", price=" + price +
                ", color='" + color + '\'' ;
    }
}
