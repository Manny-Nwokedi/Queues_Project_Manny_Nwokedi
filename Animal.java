
package Queues;

public abstract class Animal {
    private String name;
    private String breed;
    private int age;
    private String gender;
    private long arrivalTime;

    public Animal(String name, String breed, int age, String gender) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.arrivalTime = System.currentTimeMillis();
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public long getArrivalTime() {
        return arrivalTime;
    }
    public abstract String getType();
}