# Free Response Practice

## Inheritance

A company named "VehicleRental" wants to track and manage their vehicle rental inventory. They have different types of vehicles such as cars and motorcycles. Implement the following classes to represent the vehicle rental system:

### Part I

Create a `Vehicle` class that has the following properties:

- id (int): A unique identifier for the vehicle.
- make (String): The make or brand of the vehicle.
- model (String): The model of the vehicle.

The `Vehicle` class should have appropriate constructors. It should also have an appropriate toString() method. You do not need to define getters & setters.

### Part II

Create a `Car` class that extends the `Vehicle` class and adds the following properties:

- numDoors (int): The number of doors on the car.
- passengerCapacity (int): The maximum number of passengers the car can hold.

The `Car` class should have appropriate an constructor. A getter and setter for numDoors should be included.

---

Create a `Motorcycle` class that extends the Vehicle class and adds the following properties:

- hasSideCar (boolean): Indicates whether the motorcycle has a sidecar attachment.

The `Motorcycle` class should have appropriate constructors, getters, and setters for these properties.

Override the toString() method in this class to provide a string representation of the object's state.

### Part III

Create a `VehicleRentalSystem` class that contains the main method. In the main method, create an instance of a `Car` and an instance of a `Motorcycle`. Print out i) the number of doors on the car and ii) the full details of the `Motorcycle` object.

Your implementation should follow these requirements:

- Each class should be implemented in a separate file with the class name matching the file name.
- Use appropriate access modifiers for the class members.
- Ensure that the appropriate methods are overridden, if necessary.
- Use meaningful variable names and provide appropriate comments.
- Write the code for the `Vehicle`, `Car` and `Motorcycle` classes as well as the `VehicleRentalSystem` class.