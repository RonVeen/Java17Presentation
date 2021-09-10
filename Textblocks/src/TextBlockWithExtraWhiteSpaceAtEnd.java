public class TextBlockWithExtraWhiteSpaceAtEnd {

    public static void main(String... args) {
        new TextBlockWithExtraWhiteSpaceAtEnd().run();
    }


    private void run() {
        System.out.println("""
            line 1       
            line 2      """ + "*");
    }
}
