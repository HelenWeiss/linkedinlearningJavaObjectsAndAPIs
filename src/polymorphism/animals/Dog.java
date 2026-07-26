package polymorphism.animals;

import polymorphism.animals.Animal;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("woof");
    }

    public void fetch() {
        System.out.println("I am a dog. Fetch is fun!");
    }
}
