public class Bird implements Animal {

    @Override
    public void speak() {
        System.out.println("Twitter");
    }

    public void fly() {
        System.out.println("I'm flying!");
    }
}
