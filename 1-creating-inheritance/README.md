# Section 1. Creating Superclasses and Subclasses

## What is inheritance?

Inheritance is a fundamental concept that allows classes to inherit properties and behaviors from other classes. It promotes code organization and facilitates the implementation of polymorphism.

## How does it work?

Inheritance allows you to define a class (subclass) that extends the functionality of another class (superclass). The subclass inherits all the properties and methods of the superclass and can add its own additional functionality or override existing methods. 

### Superclassses

```java
public class Superclass {
    // Superclass members (fields, constructors, methods)
}
```

### Subclasses
```java
public class Subclass extends Superclass {
    // Subclass members (fields, constructors, methods)
}
```

## Why is it useful?

By using inheritance and defining subclasses, you can create a class hierarchy where subclasses inherit the properties and methods of superclasses, facilitating code reuse and allowing for more specialized behavior in subclasses.