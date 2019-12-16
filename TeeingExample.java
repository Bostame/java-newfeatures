import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingExample {
    public static void main(String[] args) {
        Collector<CharSequence, ?, String> joiningCollector = Collectors.joining("-");
        Collector<String, ?, List<String>> listCollector = Collectors.toList();
        //returns joined string and individual strings as array
        Collector<String, ?, String[]> compositeCollector = Collectors.teeing(joiningCollector, listCollector,
                (joinedString, strings) -> {
                    ArrayList<String> list = new ArrayList<>(strings);
                    list.add(joinedString);
                    String[] array = list.toArray(new String[0]);
                    return array;
                });

        String[] strings = Stream.of("Apple", "Banana", "Orange").collect(compositeCollector);
        System.out.println(Arrays.toString(strings));
    }
}