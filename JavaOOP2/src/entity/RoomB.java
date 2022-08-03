package entity;

public class RoomB extends Room {
    public RoomB() {
        super("B", 300);
    }

    @Override
    public String toString() {
        return "RoomA{ type="+super.getType() +" price"+super.getPrice()+"}";
    }
}
