import static java.lang.Math.abs;

public class SwitchLabelledRule {

    public static void main(String... args) {
        new SwitchLabelledRule().run(42);
    }


    private void run(int value) {
        String answer = switch (abs(value)) {
            case 0 -> "Zero";
            case 1,2,3,4,5  -> "Five or less";
            case 42 -> "The answer to life, the universe and everything";
            default -> "Not sure, but mor than six";
        };
        System.out.println(answer);
    }
}
