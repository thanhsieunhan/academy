public class Car extends Vehicle {
    int numberOfSlot;

    String type;

    public Car(String id, String brand, int year, float price, String color, int numberOfSlot, String type) {
        super(id, brand, year, price, color);
        this.numberOfSlot = numberOfSlot;
        this.type = type;
    }

    public int getNumberOfSlot() {
        return numberOfSlot;
    }

    public void setNumberOfSlot(int numberOfSlot) {
        this.numberOfSlot = numberOfSlot;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
