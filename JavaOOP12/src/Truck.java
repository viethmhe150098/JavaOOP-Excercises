public class Truck extends Vehicle{
    private int payload;

    public Truck() {
    }

    public Truck(String id, String madeBy, int yearOfManu, double price, String color, int payload) {
        super(id, madeBy, yearOfManu, price, color);
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return super.toString()+"payload='"+payload+"'";
    }
}
