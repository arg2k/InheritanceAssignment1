package Inheritance;

public class Vehicle 
{
    private String colour;
    private int noOfWheels;
    private String model;

    public Vehicle(String colour, int noOfWheels, String model) {
        this.colour = colour;
        this.noOfWheels = noOfWheels;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Engine started");
    }

    public void stopEngine() {
        System.out.println("Engine stopped");
    }

    public String getColour() {
        return colour;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public String getModel() {
        return model;
    }
}
