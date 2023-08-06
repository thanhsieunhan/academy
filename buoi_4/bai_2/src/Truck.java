public class Truck extends Vehicle {
    float weight;

    public Truck(String id, String brand, int year, float price, String color, int weight) {
        super(id, brand, year, price, color);
        this.weight = weight;
    }
}
