package Polymorphism;

public class Zoo {

    public static void main(String[] args) {

        // typically Inheritance
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();

        Cat misty = new Cat();
        misty.scratch();
        misty.makeSound();

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
    }
}
