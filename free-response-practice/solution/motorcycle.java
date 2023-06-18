public class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(int id, String make, String model, int year, boolean hasSideCar) {
        super(id, make, model, year);
        this.hasSideCar = hasSideCar;
    }

    public toString() {
        String output = super.toString();
        output += this.hasSideCar ? " has a sidecar" : " does NOT have a sidecar";

        return output;
    }
}