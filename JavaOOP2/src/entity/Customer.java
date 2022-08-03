package entity;

public class Customer {
    private String name;
    private String idNumbers;
    private int rentDate;
    private Room room;
    public Customer() {
    }

    public Customer(String name, String idNumbers, int rentDate, Room room) {
        this.name = name;
        this.idNumbers = idNumbers;
        this.rentDate = rentDate;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumbers() {
        return idNumbers;
    }

    public void setIdNumbers(String idNumbers) {
        this.idNumbers = idNumbers;
    }

    public int getRentDate() {
        return rentDate;
    }

    public void setRentDate(int rentDate) {
        this.rentDate = rentDate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", idNumber='" + idNumbers + '\'' +
                ", rentDate=" + rentDate +
                ", room=" + room +
                '}';
    }
}
