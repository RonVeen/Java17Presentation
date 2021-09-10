import static java.lang.Math.abs;

public class SwitchClassic {

    public static void main(String... args) {
        new SwitchClassic().run(42);
    }


    private void run(int value) {
        String answer = null;
        switch (abs(value)) {
            case 0:
                answer =  "Zero";
                break;
            case 1,2,3,4,5:
                answer =  "Five or less";
                break;
            case 42:
                answer = "The answer to life, the universe and everything";
                break;
            default:
                answer = "Not sure, but mor than six";
                break;
        };
        System.out.println(answer);
    }


}
