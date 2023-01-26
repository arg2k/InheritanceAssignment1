package Inheritance;

public class Bus extends Vehicle {
	public Bus(String colour, int noOfWheels, String model) {
        super(colour, noOfWheels, model);
    }

    public void pickUpPassenger() {
        System.out.println("Passenger picked up");
    }

    public void dropOffPassenger() {
        System.out.println("Passenger dropped off");
    }
}
