import java.io.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NullReader {
    public static void main(String[] args) throws IOException {
        Reader reader1 = new StringReader("test string data");
        Reader reader2 = Reader.nullReader();//new method
        Reader reader3 = new CharArrayReader(new char[]{'B', 'O', 'S', 'T', 'A', 'M', 'E'});
        printData(List.of(reader1, reader2, reader3));
        reader1.close();
        reader2.close();
        reader3.close();
    }

    public static void printData(List<Reader> readers) {
        readers.stream()
               .map(BufferedReader::new)
               .map(BufferedReader::lines)
               .forEach(stream -> stream.forEach(System.out::println));
    }
}