package hw6;

public class Dog extends Animal{
    private static final int RUN_LIMIT = 500;
    private static final int SWIM_LIMIT = 10;

    public Dog(String name) {
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
        if (Math.abs(distance) <= SWIM_LIMIT){
            super.swim(distance);
        }
        else{
            System.out.println(getName() + " can't swim that far.");
        }
    }

}
