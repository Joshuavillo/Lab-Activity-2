
public class Main {
    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }

    public static void performService(Serviceable item) {
        item.Service();
    }

    public static void main(String[] args) {

        // DEMO 1: A parent reference can refer to a child object.
        System.out.println("=== 1. Parent Reference ===");

        Vehicle vehicle = new Car("Ford", "Mustang", 1967, 4);
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
        performService((Serviceable) vehicle);
        System.out.println();

        // The same variable now refers to a Motorcycle object.
        vehicle = new Motorcycle("Honda", "Click 125i", 2023, "125cc Single-Cylinder");
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
        performService((Serviceable) vehicle);
        System.out.println();

        // DEMO 2: One method accepts different Vehicle subclasses.
        System.out.println("\n=== 2. Method Parameter ===");

        Car car = new Car("Mitsubishi", "Mirage G4", 2021, 4);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "NMAX 155", 2024, "155cc Single-Cylinder");
        Truck truck = new Truck("Isuzu", "Elf", 2020, 6);

        printDetails(car);
        car.moveForward();
        car.moveBackward();
        car.moveLeft();
        car.moveRight();
        performService((Serviceable) car);
        System.out.println();
        printDetails(motorcycle);
        motorcycle.moveForward();
        motorcycle.moveBackward();
        motorcycle.moveLeft();
        motorcycle.moveRight();
        performService((Serviceable) motorcycle);
        System.out.println();
        printDetails(truck);
        truck.moveForward();
        truck.moveBackward();
        truck.moveLeft();
        truck.moveRight();
        performService((Serviceable) truck);
        System.out.print("");

        // DEMO 3: One array holds different Vehicle subclasses.
        System.out.println("\n=== 3. Polymorphic Array ===");

        Vehicle[] vehicles = {
                new Car("Honda", "City", 2022, 4),
                new Motorcycle("Honda", "TMX 125", 2021, "125cc Single-Cylinder"),
                new Truck("Mitsubishi", "Canter", 2020, 6)
        };

        Serviceable[] serviceables = {
                new Car("Honda", "City", 2022, 4),
                new Motorcycle("Honda", "TMX 125", 2021, "125cc Single-Cylinder"),
                new Truck("Mitsubishi", "Canter", 2020, 6),
                new Printer()
        };

        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
            currentVehicle.moveForward();
            currentVehicle.moveBackward();
            currentVehicle.moveLeft();
            currentVehicle.moveRight();
            performService((Serviceable) currentVehicle);
            System.out.println();
        }

        System.out.println("=== Serviceable Items ===" + "\n");

        for (Serviceable currentServiceable : serviceables) {
            performService(currentServiceable);
            System.out.println();
        }
    }
}