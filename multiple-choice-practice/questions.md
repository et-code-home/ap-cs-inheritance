# Multiple Choice Practice

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

a) "Animal making sound"  
b) "Dog barking"  
c) It will result in a compilation error  
d) It will result in a runtime error  

**Question 2:**

Which of the following statements about inheritance is true?

a) A subclass can access the private members of its superclass  
b) A superclass can inherit methods from its subclasses  
c) Multiple inheritance is supported in Java  
d) Inheritance allows a class to inherit methods from multiple unrelated classes  

**Question 3:**

Which keyword is used to explicitly call the superclass constructor from a subclass constructor?

a) `this`  
b) `super`  
c) `extends`  
d) `implements`  

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

a) "Drawing a shape"  
b) "Drawing a circle"  
c) It will result in a compilation error  
d) It will result in a runtime error  

**Question 5:**

Which of the following is true about method overriding in Java?

a) The overriding method must have the same return type as the overridden method  
b) The overriding method can have a lower access level than the overridden method  
c) The overriding method can throw broader checked exceptions than the overridden method  
d) The `final` methods in the superclass can be overridden  

**Question 6:**

Which of the following is the correct way to call a superclass method from a subclass method?

a) `super.methodName();`  
b) `this.methodName();`  
c) `methodName();`  
d) `methodName(super);`  

**Question 7:**

Which of the following statements is true regarding the `super()` keyword in Java?

a) It can only be used inside a constructor  
b) It can be used to access the superclass members directly  
c) It is used to create a new instance of the superclass  
d) It is used to indicate that a method is being overridden  

**Question 8:**

Which of the following is not a benefit of inheritance?

a) Code reusability  
b) Polymorphism  
c) Encapsulation  
d) Flexibility in design and maintenance  

**Question 9:**

Which of the following statements about abstract classes and interfaces is true?

a) An abstract class can be instantiated directly  
b) An interface can have method implementations  
c) An abstract class can implement multiple interfaces  
d) An interface can have instance variables  

**Question 10:**

Which of the following is true about the `instanceof` operator in Java?

a) It checks if an object is equal to a specific value 
b) It checks if an object is null  
c) It checks if two objects are equal  
d) It checks if an object is an instance of a specific class