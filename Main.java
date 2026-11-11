public class Main {

    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }
    public static void main(String[] args) {
        // DEMO 1: A parent reference can refer to a child object.
        System.out.println("=== 1. Parent Reference ===");
        Vehicle vehicle = new Car ("Ford", "Mustang", 2020, 2);
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
        System.out.println();

        // The Same Variable now Refer to a Motorcycle Object.
        vehicle = new Motorcycle("Harley-Davidson", "Street 750", 2019, "V-Twin");
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();

        // DEMO 2: One Method accepts different Vehicle subclasses
        System.out.println("\n === 2. Method Parameter ===");
        Car car = new Car ("Toyota", "Camry", 2021, 4);
        Motorcycle motorcycle = new Motorcycle("Ducati", "Panigale V4", 2022, "V4");
        Truck truck = new Truck("Volvo", "FH16", 2020, 18);
        printDetails(car);
        car.moveForward();
        car.moveBackward();
        car.moveLeft();
        car.moveRight();
        printDetails(motorcycle);
        motorcycle.moveForward();
        motorcycle.moveBackward();
        motorcycle.moveLeft();
        motorcycle.moveRight();
        printDetails(truck);
        truck.moveForward();
        truck.moveBackward();
        truck.moveLeft();
        truck.moveRight();

        // DEMO 3: One array holds different Vehicle subclasses
        System.out.println("\n === 3. Polymorphic Array ===");
        Vehicle[] vehicles = {
            new Car("Honda", "Civic", 2018, 4),
            new Motorcycle("Yamaha", "MT-07", 2020, "Parallel Twin"),
            new Truck("Ford", "F-150", 2019, 4)
        };

    for(Vehicle currentVehicle: vehicles){
        printDetails(currentVehicle);
        currentVehicle.moveForward();
        currentVehicle.moveBackward();
        currentVehicle.moveLeft();
        currentVehicle.moveRight();
        System.out.println();
    }
}
}
