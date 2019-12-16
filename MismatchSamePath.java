import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MismatchSamePath {
    public static void main(String[] args) throws IOException {
        Path filePath1 = Path.of("c:\\temp\\testFile.txt");
        Path filePath2 = Path.of("c:\\temp\\testFile.txt");
        System.out.println("file exists: "+Files.exists(filePath1));
        long mismatch = Files.mismatch(filePath1, filePath2);
        System.out.println(mismatch);

        filePath1.toFile().deleteOnExit();
        filePath2.toFile().deleteOnExit();
    }
}