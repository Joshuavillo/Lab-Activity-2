public class Motorcycle extends Vehicle {
    private String EngineType;

    public Motorcycle(String brand, String model, int year, String EngineType) {
        super(brand, model, year);
        this.EngineType = EngineType;
    }

    @Override 
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Type: " + EngineType);
    }

    public void moveForward() {
        System.out.println("Motorcycle is moving forward.");
    }
    public void moveBackward() {
        System.out.println("Motorcycle is moving backward.");
    }
    public void moveLeft() {
        System.out.println("Motorcycle is turning left.");
    }
    public void moveRight() {
        System.out.println("Motorcycle is turning right.");
    }
}
