package lesson6;

public class AnimalTest {
    public static void main(String[] args) {
        Animal cat = new Cat("Floppa");
        Animal dog = new Dog("Doge");
        Animal cow = new Cow("Buryonka");
        cat.say();
        dog.say();
        cow.say();
    }
}
