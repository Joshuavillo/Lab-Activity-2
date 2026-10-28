public class Car extends Vehicle {
    private int numberofDoors;

    Car(String brand, String model, int year, int numberofDoors) {
        super(brand, model, year);
        this.numberofDoors = numberofDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberofDoors + "\n");
    }
}
