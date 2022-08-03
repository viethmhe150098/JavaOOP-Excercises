public class MotorBike extends Vehicle{
    private int wattage;

    public MotorBike() {
    }

    public MotorBike(String id, String madeBy, int yearOfManu, double price, String color, int wattage) {
        super(id, madeBy, yearOfManu, price, color);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return super.toString()+"wattage='"+this.wattage+"'";
    }
}
