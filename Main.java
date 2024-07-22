package Queues;

public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        // Adding animals to the shelter
        shelter.enqueue(new Cat("Mittens", "Chartreux", 7, "Male"));
        shelter.enqueue(new Cat("Ziggy", "Balinese", 5, "Female"));
        shelter.enqueue(new Dog("Shiloh", "Shetland Sheepdog", 8, "Male"));

        // Dequeue animals in good order and show their information
        Animal anyAnimal = shelter.dequeueAny();
        Animal cat = shelter.dequeueCat();
        Animal dog = shelter.dequeueDog();

        System.out.println("Dequeued any: " + formatAnimalInfo(anyAnimal));
        System.out.println("Dequeued cat: " + formatAnimalInfo(cat));
        System.out.println("Dequeued dog: " + formatAnimalInfo(dog));
    }
    public static String formatAnimalInfo(Animal animal) {
        if (animal != null) {
            return animal.getName() + " (" + animal.getBreed() + ") - " + animal.getAge() + " years old, " + animal.getGender();
        }
        return "No animal";
    }
}

    // An animal shelter, which holds only dogs and cats, operates on a strictly
// "first in, first out" basis. People must adopt either the "oldest" (based on arrival time) of
//  all animals at the shelter, or they can select whether they would
//  prefer a dog or a cat (and will receive the oldest animal of that type).
//   They cannot select which specific animal they would like.
//   Create the data structures to maintain this system and implement
//   operations such as enqueue, dequeueAny, dequeueDog, and dequeueCat.

