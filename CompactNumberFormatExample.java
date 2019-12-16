import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;

public class CompactNumberFormatExample {
    public static void main(String[] args) {
        formatForLocale(Locale.US);
        formatForLocale(Locale.GERMANY);
    }

    private static void formatForLocale(Locale locale) {
        List<Integer> numbers = List.of(1000, 1000000, 1000000000);
        System.out.printf("-- SHORT format for locale=%s --%n", locale);
        numbers.stream().forEach((num) -> {
            NumberFormat nf = NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.SHORT);
            String format = nf.format(num);
            System.out.println(format);
        });
        System.out.printf("-- LONG format for locale=%s --%n", locale);
        numbers.stream().forEach((num) -> {
            NumberFormat nf = NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.LONG);
            String format = nf.format(num);
            System.out.println(format);
        });
    }
}