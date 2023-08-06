public class MotoBike extends  Vehicle {
    public MotoBike(String id, String brand, int year, float price, String color, String pressure) {
        super(id, brand, year, price, color);
        this.pressure = pressure;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    String pressure;
}
