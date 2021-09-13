public class SealedClassesPatternMatching {

    public static void main(String... args) {
       SealedClassesPatternMatching app = new SealedClassesPatternMatching();
       Ocelot ocelot = new Ocelot();
       System.out.println(app.printValue(ocelot));
    }

    private String printValue(Feline feline) {
        return switch (feline) {
            case Tiger t -> "It is a tiger";
            case Puma p -> "It's a puma";
            case Ocelot p -> "It's an ocelot";
        };
    }
}
