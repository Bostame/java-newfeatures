import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TeeingExample2 {
    public static void main(String[] args) {
        Collector<Integer, ?, Long> summing = Collectors.summingLong(Integer::valueOf);
        Collector<Integer, ?, Long> counting = Collectors.counting();

        //example list
        List<Integer> list = List.of(1, 2, 4, 5, 7, 8);

        //collector for  map entry consisting of sum and count
        Collector<Integer, ?, Map.Entry<Long, Long>> sumAndCountMapEntryCollector =
                Collectors.teeing(summing, counting, Map::entry);
        Map.Entry<Long, Long> sumAndCountMap = list.stream().collect(sumAndCountMapEntryCollector);
        System.out.println(sumAndCountMap);

        //collect sum and count as List
        Collector<Integer, ?, List<Long>> sumAndCountListCollector =
                Collectors.teeing(summing, counting, List::of);//(v1, v2) -> List.of(v1, v2)
        List<Long> sumAndCountArray = list.stream().collect(sumAndCountListCollector);
        System.out.println(sumAndCountArray);
    }
}