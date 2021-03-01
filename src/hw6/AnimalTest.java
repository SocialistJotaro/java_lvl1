package hw6;

public class AnimalTest {
    public static void main(String[] args) {
        Animal dogBobik = new Dog("Bobik");
        Animal catBarsik = new Cat("Barsik");
        Animal catVasya = new Cat("Vasya");
        dogBobik.run(100);
        dogBobik.run(1000);
        dogBobik.swim(10);
        dogBobik.swim(100);
        catBarsik.run(199);
        catBarsik.run(1500);
        catBarsik.swim(10);
    }
}
