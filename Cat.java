public class Cat extends Animal implements Pet {
    public Cat(String name) {
        super(4);
    }

    public Cat() {
        this("");
    }

    @Override
    public void eat() {
        System.out.println("The cat eats fish.");
    }

    @Override
    public void play() {
        System.out.println("The cat plays with a ball of yarn.");
    }

    @Override
    public void beFriendly() {
        System.out.println("The cat purrs and rubs against your leg.");
    }
}