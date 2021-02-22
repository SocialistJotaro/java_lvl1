package lesson5;

public class Test {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore();
        for (int i = 0; i < 10; i++) {
            System.out.println(semaphore.getState());
            semaphore.next();
        }
    }
}
