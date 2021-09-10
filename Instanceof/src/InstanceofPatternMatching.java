public class InstanceofPatternMatching {

    public static void main(String... args) {
        new InstanceofPatternMatching().run();
    }


    private void run() {
        Animal animal = new Cat();
        doClassic(animal);
        doNew(animal);
        animal = new Bird();
        doNew(animal);
    }

    private void doNew(Animal animal) {
        if (animal instanceof Cat c) {
            c.speak();
            c.jump();
        }

        if (animal instanceof Bird b) {
            b.speak();
            b.fly();
        }
    }


    private void doClassic(Animal animal) {
        if (animal instanceof Cat) {
            Cat c = (Cat)animal;
            c.speak();
            c.jump();
        }

        if (animal instanceof Bird) {
            Bird b = (Bird)animal;
            b.speak();
            b.fly();
        }
    }
}
