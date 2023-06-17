# Section 2. Writing Constructors

In Java, constructors for superclasses and subclasses are written using the same syntax as regular methods but with the name of the class. 

## How does it work?

### Superclass Constructor

- The constructor for the superclass is written within the superclass itself. It is responsible for initializing the instance variables or performing any necessary setup for the superclass.
- The constructor name must match the name of the class.

```java
public class Superclass {
    public Superclass() {
        // Constructor code
    }
}
```

### Subclass Constructor

- The constructor for the subclass is written within the subclass itself. It can call the superclass constructor using the super() keyword to initialize the inherited members from the superclass. The super() call must be the first statement in the subclass constructor.
- The subclass constructor can also contain its own additional code.

```java
public class Subclass extends Superclass {
    public Subclass() {
        super();  // Call to superclass constructor
        // Additional code for subclass constructor
    }
}
```

### Parameterized Constructor

- Constructors can also accept parameters to initialize the instance variables. This can be useful when you want to provide values during object creation.
- Both superclasses and subclasses can have parameterized constructors.

```java
public class Superclass {
    public Superclass(int parameter) {
        // Constructor code with parameter
    }
}

public class Subclass extends Superclass {
    public Subclass(int parameter) {
        super(parameter);  // Call to superclass parameterized constructor
        // Additional code for subclass constructor
    }
}
```

### Default Constructor

- If you don't explicitly provide a constructor in your class, Java automatically adds a default constructor with no arguments.
- The default constructor initializes the superclass using the default constructor of the superclass, or the parameterless constructor if one is defined.
- However, if you define a constructor with parameters in the superclass, and no default constructor is explicitly provided, you need to explicitly call the superclass constructor using `super()` in the subclass constructor.

## Why is it useful?

By defining constructors in superclasses and subclasses, you can initialize the state of objects and ensure that the necessary setup is performed during object creation.