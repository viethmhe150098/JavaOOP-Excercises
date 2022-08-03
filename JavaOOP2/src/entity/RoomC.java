package entity;

public class RoomC extends Room{
    public RoomC() {
        super("C", 100);
    }

    @Override
    public String toString() {
        return "RoomA{ type="+super.getType() +" price"+super.getPrice()+"}";
    }
}
