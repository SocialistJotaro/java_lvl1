package hw6;

public class Cat extends Animal{

    private static final int RUN_LIMIT = 200;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (Math.abs(distance) <= RUN_LIMIT){
            super.run(distance);
        }
        else{
            System.out.println(getName() + " can't run that far.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats can't swim.");
    }
}
