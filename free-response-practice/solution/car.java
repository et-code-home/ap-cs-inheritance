public class Car extends Vehicle {
    private int numDoors;
    private int passengerCapacity;

    public Car(int id, String make, String model, int year, int numDoors, int passengerCapacity) {
        super(id, make, model, year);
        this.numDoors = numDoors;
        this.passengerCapacity = passengerCapacity;
    }

    public void setNumDoors(num) {
        this.numDoors = num;
    }

    public int getNumDoors() {
        return this.numDoors;
    }
}