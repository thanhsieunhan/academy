public abstract class Vehicle {
    String id;
    String brand;

    int year;

    public String getId() {
        return id;
    }

    public Vehicle(String id, String brand, int year, float price, String color) {
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    float price;

    String color;
}
