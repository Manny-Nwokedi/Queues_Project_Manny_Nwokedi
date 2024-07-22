package Queues;

import java.util.LinkedList;

public class AnimalShelter {
    private LinkedList<Dog> dogs;
    private LinkedList<Cat> cats;

    public AnimalShelter() {
        dogs = new LinkedList<>();
        cats = new LinkedList<>();
    }
    public void enqueue(Animal animal) {
        if (animal instanceof Dog) {
            dogs.addLast((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.addLast((Cat) animal);
        }
    }
    public Animal dequeueAny() {
        if (dogs.isEmpty() && cats.isEmpty()) {
            return null;
        } else if (dogs.isEmpty()) {
            return cats.poll();
        } else if (cats.isEmpty()) {
            return dogs.poll();
        } else {
            Dog oldestDog = dogs.peek();
            Cat oldestCat = cats.peek();
            if (oldestDog.getArrivalTime() < oldestCat.getArrivalTime()) {
                return dogs.poll();
            } else {
                return cats.poll();
            }
        }
    }
    public Dog dequeueDog() {
        return dogs.poll();
    }
    public Cat dequeueCat() {
        return cats.poll();
    }
}