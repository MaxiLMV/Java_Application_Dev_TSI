package animals;

class Cat implements Animal, Domestic {
    public void printName() {
        System.out.println("Cat's name is Charlie");
    }
    public void sound() {
        System.out.println("Meow");
    }
}
