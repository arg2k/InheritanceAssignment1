package Inheritance;

public class Car extends Vehicle {
	public Car(String colour, int noOfWheels, String model) {
        super(colour, noOfWheels, model);
    }

    public void openSunRoof() {
        System.out.println("Sunroof is open");
    }

    public void closeSunRoof() {
        System.out.println("Sunroof is closed");
    }
}
