# Section 3. Overriding Methods

Overriding methods is a powerful feature in object-oriented programming that allows a subclass to provide its own implementation of a method defined in its superclass. When a subclass inherits a method from its superclass, it can override that method to customize its behavior based on its specific requirements. Here are some important points to understand about method overriding in Java:

- **Method Signature** - When overriding a method, the method in the subclass must have the same name, return type, and parameter list (method signature) as the method in the superclass.
- **`super` Keyword** - Inside the overriding method, you can use the `super` keyword to invoke the superclass version of the method. This can be useful if you want to add functionality to the existing implementation of the superclass method.

```java
@Override
public void methodName(parameters) {
    super.methodName(parameters);  // Invokes the superclass method
    // Additional code for the overriding method
}
```

- **Polymorphism** - Method overriding is closely related to the concept of polymorphism. When you have a reference of the superclass type pointing to an object of the subclass type, calling an overridden method on that reference will execute the subclass implementation of the method.

## How does it work?

If you want to modify the behavior of a method inherited from the superclass, you can override it in the subclass by providing a new implementation.

```java
public class Subclass extends Superclass {
    // ...

    @Override
    public void someMethod() {
        // New implementation for the overridden method
    }
}
```

## Why is it useful?

By overriding methods, you can provide specialized behavior in subclasses while maintaining a common interface through the superclass. This enables you to write more flexible and modular code that can be easily extended and customized as needed.