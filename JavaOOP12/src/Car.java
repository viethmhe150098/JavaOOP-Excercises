public class Car extends Vehicle{
    private int seat;
    private String engineType;

    public Car() {
    }

    public Car(String id, String madeBy, int yearOfManu, double price, String color, int seat, String engineType) {
        super(id, madeBy, yearOfManu, price, color);
        this.seat = seat;
        this.engineType = engineType;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return super.toString()+"seat='"+this.seat+"'\'"+"engineType='"+this.engineType+"'";
    }
}
