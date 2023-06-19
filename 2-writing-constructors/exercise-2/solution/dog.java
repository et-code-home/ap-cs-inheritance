class Dog extends Animal {
    public Dog(String name, boolean doesTricks) {
        super(name);
        this.doesTricks = doesTricks;
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }
}