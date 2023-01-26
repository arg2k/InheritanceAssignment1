package Inheritance;

public class Road {
	public static void main(String[] args) {
        Truck t1 = new Truck("Red", 18, "Volvo");
        Bus b1 = new Bus("Blue", 12, "Mercedes");
        Car c1 = new Car("Black", 4, "BMW");

        System.out.println("Truck: ");
        System.out.println("Colour: " + t1.getColour());
        System.out.println("No of wheels: " + t1.getNoOfWheels());
        System.out.println("Model: " + t1.getModel());
        t1.startEngine();
        t1.loadCargo();
        t1.stopEngine();

        System.out.println("\nBus: ");
        System.out.println("Colour: " + b1.getColour());
        System.out.println("No of wheels: " + b1.getNoOfWheels());
        System.out.println("Model: " + b1.getModel());
        b1.startEngine();
        b1.pickUpPassenger();
        b1.stopEngine();

        System.out.println("\nCar: ");
        System.out.println("Colour: " + c1.getColour());
        System.out.println("No of wheels: " + c1.getNoOfWheels());
        System.out.println("Model: " + c1.getModel());
        c1.startEngine();
        c1.openSunRoof();
        c1.stopEngine();
    }
}
