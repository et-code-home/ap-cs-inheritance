# Solution

## Vehicle

### 2 points 

- creating the properties + constructor
- writing the toString method

```java
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
```

## Car

### 2.5 points 

- using the extends keyword correctly
- creating the properties + constructor
- writing the getter/setter methods for numDoors

```java
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
```

## Motorcycle

### 2.5 points 

- using the extends keyword correctly
- creating the properties + constructor
- overriding the parent toString method

```java
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
```

## VehicleRentalSystem

### 2 points

- using constructors to create new instances
- using instance methods to print the correct information to the console

```java
public class VehicleRentalSystem() {
    public static void main(int[] args) {
        Car carOne = new Car();
        Motorcycle motoOne = new Moto();

        System.out.println(carOne.getNumDoors);
        System.out.println(motoOne.toString());
    }
}
```