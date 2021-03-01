package hw6;

public class Animal {
    private String name;
    private int animalId;
    private int catId;
    private int dogId;

    public Animal(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int distance){
        System.out.println(name + " ran " + Math.abs(distance) + "m.");
    }

    public void swim(int distance){
        System.out.println(name + " swam " + Math.abs(distance) + "m.");
    }
}
