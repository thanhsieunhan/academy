// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Vehicle[] vehicleList = new Vehicle[3];
    public static void main(String[] args) {
        //
        Car car1 = new Car("1", "Toyota", 2023, 1000, "red", 5, "type 1");
        vehicleList[0] = car1;

        MotoBike motoBike1 = new MotoBike("2", "Honda", 2024, 300, "red", "pressure 1");
        vehicleList[1] = motoBike1;

        Truck truck1 = new Truck("3", "Suzuki", 2022, 500, "blue", 123);
        vehicleList[2] = truck1;

        Car car2 = new Car("4", "Toyota", 2023, 1000, "red", 5, "type 1");
        vehicleList[3] = car2;

        for (Vehicle vehicle: vehicleList) {
            System.out.println(vehicle.brand);
        }
    }
}