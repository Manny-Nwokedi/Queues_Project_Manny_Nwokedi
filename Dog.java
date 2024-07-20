package Queues;

public class Dog extends Animal {
    public Dog(String name, String breed, int age, String gender) {
        super(name, breed, age, gender);
    }

    @Override
    public String getType() {
        return "Dog";
    }
}
