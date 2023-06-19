# Exercise 1

```java
class Animal {
    // To be completed
}

class Dog {
    // To be completed
}

class Cat {
    // To be completed
}

public class Main {
    public static void main(String[] args) {
        // To be completed
    }
}
```

## Instructions

### Complete the classes shown above.

In the `Animal` superclass:  

1. Create a name property  
2. Write a constructor to initialize this property
3. Define two methods: eat() and sleep()

Do the following to complete the `Dog` and `Cat` subclasses:  

4. Use the `extends` keyword to establish the inheritance relationships
5. Write constructors that take the name parameter and call the superclass constructor using the `super` keyword

In the `Dog` class:  

6. Add the additional method bark()

In the `Cat` class:  

7. Add the additional method meow()

In the `Main` class:  

8. Create instances of Dog and Cat objects
9. Call the eat(), sleep() and bark() methods on the instance of a Dog 
10. Call the eat(), sleep() and meow() methods on the instance of a Cat

### The output will be something like:

```bash
Buddy is eating.
Buddy is sleeping.
Woof! Woof!
Whiskers is eating.
Whiskers is sleeping.
Meow!
```
