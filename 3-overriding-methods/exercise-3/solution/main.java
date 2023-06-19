public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: "Animal making sound"

        Dog dog = new Dog();
        dog.makeSound(); // Output: "Dog barking"

        Animal dogAnimal = new Dog();
        dogAnimal.makeSound(); // Output: "Dog barking"
    }
}