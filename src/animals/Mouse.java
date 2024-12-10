package animals;

public class Mouse extends Animal {
    @Override
    void makeSound() {
        System.out.println("Пи-пи-пи!");
    }

    @Override
    void eat() {
        System.out.println("Мышь ест");
    }
}
