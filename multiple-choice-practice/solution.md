# SOLUTION to Multiple Choice Practice Questions

## Inheritance

**Question 1:**

Consider the following code:

```java
class Animal {
    public void makeSound() {
        System.out.println("Animal making sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
    }
}
```

What is the output of the above code?

a. "Animal making sound"  
b. "Dog barking"  
c. It will result in a compilation error  
d. It will result in a runtime error  

> **b** - Because the variable `animal` is created as an `Dog`, it will use the `makeSound()` method of that class. 

**Question 2:**

Which of the following statements about inheritance is true?

a. A subclass can access the private members of its superclass  
b. A superclass can inherit methods from its subclasses  
c. Multiple inheritance is supported in Java  
d. Inheritance allows a class to inherit methods from multiple unrelated classes  

> **a** - Private methods in a superclass are not accessible to its subclasses. Classes in Java can only `extend` one other class. And subclasses inherit from the related superclass.

**Question 3:**

Which keyword is used to explicitly call the superclass constructor from a subclass constructor?

a. `this`  
b. `super`  
c. `extends`  
d. `implements`  

> **b** - The `super` keyword refers to superclass (parent) objects. It is used to call superclass methods, and to access the superclass constructor. 

**Question 4:**

Consider the following code:

```java
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        Circle circle = (Circle) shape;
        circle.draw();
    }
}
```

What is the output of the above code?

a. "Drawing a shape"  
b. "Drawing a circle"  
c. It will result in a compilation error  
d. It will result in a runtime error  

> **b** - By castingthe  `shape` variable to a `Circle`, we make it so that the `draw()` method of the circle class will be used.

**Question 5:**

Which of the following is true about method overriding in Java?

a. Superclasses can override methods in classes that inherit from them  
b. The overriding method can have a different number of parameters  
c. The overriding method must have the same return type as the overridden method  
d. The `final` methods in the superclass can be overridden  

> **c** - Subclassess can override methods from their parent class, not the other way around. And we cannot override `final` methods. But overriding is allowed as long as the methods have the same signature (name, plus the number and the type of its parameters)

**Question 6:**

Which of the following is the correct way to call a superclass method from a subclass method?

a. `methodName(super);` 
b. `this.methodName();`  
c. `methodName();`  
d. `super.methodName();`   

> **d** - The `super` keyword without any () allows us to refer to methods defined in the parent class.

**Question 7:**

Which of the following is true about the `instanceof` operator in Java?

a. It checks if an object is equal to a specific value 
b. It checks if an object is null  
c. It checks if two objects are equal  
d. It checks if an object is an instance of a specific class

> **d** - This operator allows us to check the type of data we're working with. But it doesn't tell us about the specific value.