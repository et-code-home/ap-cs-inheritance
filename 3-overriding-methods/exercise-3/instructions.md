# Exercise 3

```java
class Animal {
    // To be completed
}

class Dog {
    // To be completed
}

public class Main {
    public static void main(String[] args) {
        // To be completed
    }
}
```

## Instructions

### Complete the three classes shown above.

Inside the `Animal` class:  

1. Create the String property `sound`
2. Initialize the above property in a constructor
3. Create a method named `makeSound()` that prints out a string with the `sound` property

To complete the `Dog` class:  

4. Use the `extends` keyword so that `Dog` is a subclass of `Aniaml`
5. Create the boolean property `hasOwner`
6. Initialize the above property in a constructor and use `super()` to correctly call the parent constructor
7. Override the `makeSound()` method with a different implementation

In the `main` method:  

8. Create an instance of the `Animal` class and call the `makeSound()` method on it 
    - Since the object is of type `Animal`, the method in the `Animal` class is invoked  
9. Create an instance of the `Dog` class and call the `makeSound()` method 
    - Since the object is of type `Dog`, the overridden method in the `Dog` class is invoked
10. Create an instance of the `Dog` class but assign it to a variable of type `Animal` 
11. Call the `makeSound()` method on this object
    - The method is still dynamically bound to the implementation in the `Dog` class, even though the reference type is `Animal`, therefore the method in the subclass is invoked

This example demonstrates how method overriding allows a subclass to provide its own implementation of a method defined in the superclass, allowing for polymorphic behavior based on the actual type of the object.