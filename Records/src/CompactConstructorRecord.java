import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.Locale;
import java.util.stream.Stream;

import static java.util.Objects.requireNonNull;

public record CompactConstructorRecord(String name, String color, int age) implements ActionListener {

    //  Static variables are allowed
    public static int ageSum = 0;

    public CompactConstructorRecord {
        requireNonNull(name, "Name cannot be null");
        if (age < 0) {
            throw new IllegalArgumentException("Age should be 0 or larger");
        }
        ageSum += age(); //  update static var
    }

    public static void main(String... args) {
        CompactConstructorRecord ccr = new CompactConstructorRecord("Mittens", "gray", 3);
        //  Invoke the generated toString()
        System.out.println(ccr);
        //  Access instance variables
        System.out.println("name is " + ccr.name());
        //  Access static variables
        System.out.println("Collected age is " + CompactConstructorRecord.ageSum);
        //  Access instance methods
        System.out.println("Reversed name is " + ccr.reverseName());

        //  Next line will throw an exception
        ccr = new CompactConstructorRecord("Garfield", "red", -1);
    }

    //  Instance method
    public String reverseName() {
        return new StringBuilder(name()).reverse().toString().toLowerCase();
    }

    //  Implements interface
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}

