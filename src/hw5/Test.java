package hw5;

public class Test {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivan Ivanov", "Engineer", "ivanov@mail.ru", "+79991234567", 30000, 30);
        empArray[1] = new Employee("Alex Alexandrov", "Programmer", "alex@mail.ru", "+79991234568", 20000, 25);
        empArray[2] = new Employee("Petr Petrov", "Senior Engineer", "petrov@mail.ru", "+79991234569", 45000, 45);
        empArray[3] = new Employee("Boss Bossov", "CEO", "boss@mail.ru", "+79999999999", 100000, 50);
        empArray[4] = new Employee("Fedor Fedorov", "Janitor", "fedya@mail.ru", "+79991111111", 15000, 55);
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() > 40) {
                empArray[i].getInfo();
            }
        }
    }
}
