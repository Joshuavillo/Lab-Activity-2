public class Truck extends Vehicle {
    private int numberOfWheels;

    Truck(String brand, String model, int year, int numberOfWheels) {
        super(brand, model, year);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Wheels: " + numberOfWheels);
    }

    public void moveForward() {
        System.out.println("Truck is moving forward.");
    }
    public void moveBackward() {
        System.out.println("Truck is moving backward.");
    }
    public void moveLeft() {
        System.out.println("Truck is turning left.");
    }
    public void moveRight() {
        System.out.println("Truck is turning right.");
    }
}
