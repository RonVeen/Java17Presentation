public class ParenthesizedPatternMatching {

    public static void main(String... args) {
        ParenthesizedPatternMatching app = new ParenthesizedPatternMatching();
        System.out.println(app.printValue("xx"));
        System.out.println(app.printValue("!"));
        System.out.println(app.printValue("@@"));
    }

    private boolean printValue(Object obj) {
        return switch (obj) {
            case String s && s.length() >= 2 && (s.contains("@") || s.contains("!")) -> true;
            default -> false;
        };
    }
}
