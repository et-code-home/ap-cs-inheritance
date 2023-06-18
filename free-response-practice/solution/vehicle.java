public class Vehicle {
    private int id;
    private String make;
    private String model;

    public Vehicle(int id, String make, String model, int year) {
        this.id = id;
        this.make = make;
        this.model = model;
    }

    public String toString() {
        return this.make + " " + this.model;
    }
}