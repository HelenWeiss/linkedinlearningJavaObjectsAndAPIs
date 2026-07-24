package Polymorphism;

public class Zoo {

    public static void main(String[] args) {

        // typically Inheritance
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        rocky.feedAnimal(); // a call of Animal's method
        feed(rocky); // a call of Zoo's method depends of is it a dog or a cat

        Cat misty = new Cat();
        misty.scratch();
        misty.makeSound();
        misty.feedAnimal(); // a call of Animal's method
        feed(misty); // a call of Zoo's method depends of is it a dog or a cat

        // Polymorphism
        System.out.println("Animal a dog becomes a cat:)");
        Animal chap = new Dog();
        // chap.fetch(); error, there is no method fetch in Animal
        ((Dog)chap).fetch(); // Object typecasting; Chap is still an animal. not a dog
        chap.makeSound();

        chap = new Cat();
        //chap.fetch(); error, there is no method fetch in Animal
        ((Cat)chap).scratch(); // Object typecasting; Chap is still an animal. not a cat
        chap.makeSound();
        feed(chap); // a call of Zoo's method depends of is it a dog or a cat
    }

    public static void feed(Animal animal) {
        if(animal instanceof Dog) {
            System.out.println("here's your dog food");
        } else if(animal instanceof Cat) {
            System.out.println("here's your cat food");
        }
    }
}
