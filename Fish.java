public class Fish extends Animal {
    public Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("The fish eats flakes.");
    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk.");
    }
}