package lesson6;

public class Cat extends Animal {

    public Cat(String name){
        super(name);
    }
    @Override
    public void say(){
        System.out.println("MEOW");
    }
}
