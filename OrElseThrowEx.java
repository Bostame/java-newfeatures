import java.util.stream.Stream;

public class OrElseThrowEx {
    public static void main(String[] args) {
        String result = Stream.of("outlet", "puddle", "eraser")
                          .filter(s -> Character.isDigit(s.charAt(0)))
                          .findAny()
                          .orElseThrow();
        System.out.println(result);
    }
}