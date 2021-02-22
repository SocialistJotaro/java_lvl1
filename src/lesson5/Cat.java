package lesson5;

public class Cat {

    private String name;
    private int age;
    private int hp;
    private int strength;



    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.hp = 100;
        this.strength =5 + (int) (Math.random() * 50);
    }

    public int getHp() {
        return hp;
    }

    public int getStrength() {
        return strength;
    }
    public void fightWith(Cat otherCat, boolean mortalCombat) {
        if(mortalCombat) {
            while (true) {
                hp-= otherCat.getStrength();
                System.out.println(otherCat.getName() + "hit me by " + otherCat.getStrength()+ "dmg");
                otherCat.hp -= strength;
                System.out.println("I hit" + otherCat.name + "by" + strength + "dmg");
                if (hp <= 0){
                    System.out.println(otherCat.name + " killed me");
                    break;
                }
                if (otherCat.hp <=0 ){
                    System.out.println("I killed " +otherCat.getName());
                    break;
                }
            }
        }else {
            hp-= otherCat.strength;
            System.out.println(otherCat.name + "hit me by " + otherCat.strength+ "dmg");
            otherCat.hp -= strength;
            System.out.println("I hit" + otherCat.name + "by" + strength + "dmg");
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void meow(){
        System.out.println("Meow!");
    }
}
