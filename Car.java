public class Car extends Vehicle {
    private int numberofDoors;

    Car(String brand, String model, int year, int numberofDoors) {
        super(brand, model, year);
        this.numberofDoors = numberofDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberofDoors);
    }

    public void moveForward() {
        System.out.println("Car is moving forward.");
    }
    public void moveBackward() {
        System.out.println("Car is moving backward.");
    }
    public void moveLeft() {
        System.out.println("Car is turning left.");
    }
    public void moveRight() {
        System.out.println("Car is turning right.");
    }
}
