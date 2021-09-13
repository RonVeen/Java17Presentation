public class BasicPatternMatching {

    public static void main(String... args) {
        BasicPatternMatching app = new BasicPatternMatching();
        System.out.println(app.printValue("12"));
        System.out.println(app.printValue(42L));
        System.out.println(app.printValue(-30));
        System.out.println(app.printValue(Boolean.TRUE));
        System.out.println(app.printValue(null));
    }

    private String printValue(Object obj) {
        return switch (obj) {
            case Integer i -> String.format("It is an integer with value %d", i);
            case Long l -> String.format("It is a Long with value %d", l);
            case String s -> String.format("It is a String with value %s", s);
            case null -> new String("You can't pass in a null value!");
            default -> String.format("Dunno the type, but the value is %s", obj.toString());
        };
    }
}
