import java.util.ArrayList;
import java.util.List;

public class LocalRecordsExample {

    public static void main(String... args) {
        LocalRecordsExample example = new LocalRecordsExample();
        example.sortData(example.getData());
    }

    private List<CompactConstructorRecord> getData() {
        var data = new ArrayList<CompactConstructorRecord>();
        data.add(new CompactConstructorRecord("Name 1", "Red", 1));
        data.add(new CompactConstructorRecord("Name 2", "Grey", 6));
        data.add(new CompactConstructorRecord("Name 3", "White", 2));
        data.add(new CompactConstructorRecord("Name 4", "Green", 5));
        data.add(new CompactConstructorRecord("Name 5", "Brown", 3));
        return data;
    }

    private void sortData(List<CompactConstructorRecord> data) {

        record Person(CompactConstructorRecord info, int age) {}

        var result = data.stream()
                .map(d -> new Person(d, d.age()))
                .sorted((p1, p2) -> Integer.compare(p2.age(), p1.age()))
                .map(Person::info)
                .toList();
        result.forEach(System.out::println);

    }


}
