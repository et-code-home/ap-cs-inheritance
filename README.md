# Inheritance

The contents in this repository are designed for students and teachers in AP Computer Science A and are aligned with the [Course Framework](https://apcentral.collegeboard.org/media/pdf/ap-computer-science-a-course-and-exam-description.pdf) provided by the College Board.


## Section 1. Creating Superclasses and Subclasses

### Learning Objectives & Essential Knowledge

- Create an inheritance relationship from a subclass to the superclass. 
  - A class hierarchy can be developed by putting common attributes and behaviors of related classes into a single class called a superclass.
  - Classes that extend a superclass, called subclasses, can draw upon the existing attributes and behaviors of the superclass without repeating these in the code.
  - Extending a subclass from a superclass creates an “is-a” relationship from the subclass to the superclass.
  - The keyword extends is used to establish an inheritance relationship between a subclass and a superclass. A class can extend only one superclass.

## Section 2. Writing Constructors for Subclasses

### Learning Objectives & Essential Knowledge

- Create an inheritance relationship from a subclass to the superclass. 
  - Constructors are not inherited.
  - The superclass constructor can be called from the first line of a subclass constructor by using the keyword super and passing appropriate parameters.
  - The actual parameters passed in the call to the superclass constructor provide values that the constructor can use to initialize the object’s instance variables.
  - When a subclass’s constructor does not explicitly call a superclass’s constructor using super, Java inserts a call to the superclass’s no-argument constructor.
  - Regardless of whether the superclass constructor is called implicitly or explicitly, the process of calling superclass constructors continues until the Object constructor is called. At this point, all of the constructors within the hierarchy execute beginning with the Object constructor.

## Section 3. Overriding Methods

### Learning Objectives & Essential Knowledge

- Create an inheritance relationship from a subclass to the superclass. 
  - Method overriding occurs when a public method in a subclass has the same method signature as a public method in the superclass.
  - Any method that is called must be defined within its own class or its superclass.
  - A subclass is usually designed to have modified (overridden) or additional methods or instance variables.
  - A subclass will inherit all public methods from the superclass;

<!-- ## `super` Keyword

## Creating References Using Inheritance Hierarchies

## Polymorphism

## `Object` Superclass -->

---

### About the author

Elissa is an experienced software engineer & educator with a M.S. in Computer Science and over 10 years of experience. 

Let's connect!  
[![linkedin](./imgs/linkedin_logo.png)](https://www.linkedin.com/in/elissa-e-thomas/)