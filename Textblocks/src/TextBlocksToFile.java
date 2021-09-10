import java.io.BufferedWriter;
import java.io.FileWriter;

public class TextBlocksToFile {

    public static void main(String... args) throws  Exception{
        new TextBlocksToFile().run();
    }


    private void run() throws Exception {
        BufferedWriter writer = new BufferedWriter(new FileWriter("demo.txt"));
        writer.write("""
              <html>
                 <body>
                    <p>
                       <div>Finally some text with "    @@@           
                       </div>
                    </p>
                 </body>
              </html>""".replace("@@@", ""));
        writer.close();
    }
}
