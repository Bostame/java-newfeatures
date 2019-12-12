import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UnModifiableMapMerge {
    public static void main(String[] args) {
        Map<Integer, List<String>> map =
                Stream.of("Crying", "joyful", "Disturbed", "Healthy")
                      .collect(Collectors.toUnmodifiableMap(
                              String::length,
                              List::of,
                              UnModifiableMapMerge::mergeFunction)
                      );
        System.out.println(map);
    }

    private static List<String> mergeFunction(List<String> l1, List<String> l2) {
        List<String> list = new ArrayList<>();
        list.addAll(l1);
        list.addAll(l2);
        return list;
    }
}