package Queues;

public class Cat extends Animal {
    public Cat(String name, String breed, int age, String gender) {
        super(name, breed, age, gender);
    }
    @Override
    public String getType() {
        return "Cat";
    }
}