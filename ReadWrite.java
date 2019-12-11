import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
import static java.nio.file.Files.readString;


/*
Java 11 strives to make reading and writing of String convenient.
It has introduced the following methods for reading and writing to/from the fil>

readString()
writeString()
Following code showcases an example of this

*/

class ReadWrite{
    public static void main(String args[]) throws IOException {

        Path path = Files.writeString(Files.createTempFile("test", " .txt"),"This is a test string");
        System.out.println(path);
        String s = readString(path);
        System.out.println(s);
    }
}
