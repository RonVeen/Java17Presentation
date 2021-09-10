import static java.lang.Math.abs;

public class SwitchLabelledStatementGroep {

    public static void main(String... args) {
        SwitchLabelledStatementGroep app = new SwitchLabelledStatementGroep();
        app.run(42);
        app.runAnother(42);
    }


    private void run(int value) {
        String answer = switch (abs(value)) {
            case 0: yield "Zero";
            case 1,2,3,4,5: yield "Five or less";
            case 42: yield "The answer to life, the universe and everything";
            default: yield "Not sure, but mor than six";
        };
        System.out.println(answer);
    }

    private void runAnother(int value) {
        String answer = switch (abs(value)) {
            case 0:
                System.out.println("Value is zero");
                yield "Zero";
            case 1,2,3,4,5:
                System.out.println("Value is between 1 and 5");
                yield "Five or less";
            case 42:
                System.out.println("42!!!");
                yield "The answer to life, the universe and everything";
            default:
                System.out.println("Another value");
                yield "Not sure, but mor than six";
        };
        System.out.println(answer);
    }




}
