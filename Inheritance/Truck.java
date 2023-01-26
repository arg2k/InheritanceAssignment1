package Inheritance;

public class Truck extends Vehicle {
    public Truck(String colour, int noOfWheels, String model) {
        super(colour, noOfWheels, model);
    }

    public void loadCargo() {
        System.out.println("Cargo Loaded");
    }

    public void unloadCargo() {
        System.out.println("Cargo Unloaded");
    }
}