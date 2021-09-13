public class GuardedPattern {

    public static void main(String... args) {
        GuardedPattern app = new GuardedPattern();
        System.out.println(app.printValue("Hello"));
        System.out.println(app.printValue("Hello World!"));
    }

    private String printValue(Object obj) {
        return switch (obj) {
            case null -> new String("You can't pass in a null value!");
            case String s && s.length() > 10 -> String.format("Long String with value %s", s);
            case String s -> String.format("Not so long String with value %s", s);
            default -> String.format("Dunno the type, but the value is %s", obj.toString());
        };
    }
}
