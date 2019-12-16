import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MismatchIdentiticalContent {
    public static void main(String[] args) throws IOException {
        Path filePath1 = Files.createTempFile("my-file", ".txt");
        Path filePath2 = Files.createTempFile("my-file2", ".txt");
        Files.writeString(filePath1,"a test string");
        Files.writeString(filePath2,"a test string");

        long mismatch = Files.mismatch(filePath1, filePath2);
        System.out.println(mismatch);

        filePath1.toFile().deleteOnExit();
        filePath2.toFile().deleteOnExit();
    }
}