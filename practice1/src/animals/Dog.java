package animals;

class Dog implements Animal, Domestic {
    public void printName() {
        System.out.println("Dog's name is Willy");
    }
    public void sound() {
        System.out.println("Bark");
    }
}
