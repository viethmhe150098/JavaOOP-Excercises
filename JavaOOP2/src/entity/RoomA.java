package entity;

public class RoomA extends Room{

    public RoomA() {
        super("A", 500);
    }

    @Override
    public String toString() {
        return "RoomA{ type="+super.getType() +" price"+super.getPrice()+"}";
    }
}
