package lesson5;

public class CatTest {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", 5);
        System.out.println(barsik);
        System.out.println(barsik.getName());
        System.out.println(barsik.getAge());
        Cat floppa = new Cat("Floppa", 3);
        barsik.fightWith(floppa, true);
        floppa.meow();


    }
}
