public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat();  // Output: Buddy is eating.
        dog.sleep();  // Output: Buddy is sleeping.
        dog.bark();  // Output: Woof! Woof!

        Cat cat = new Cat("Whiskers");
        cat.eat();  // Output: Whiskers is eating.
        cat.sleep();  // Output: Whiskers is sleeping.
        cat.meow();  // Output: Meow!
    }
}