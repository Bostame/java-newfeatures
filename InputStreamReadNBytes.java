
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamReadNBytes {
    public static void main(String[] args) throws IOException {
        InputStream stream = new ByteArrayInputStream("Final data".getBytes());
        byte[] bytes = stream.readNBytes(5);//new method
        System.out.println(new String(bytes));
        stream.close();
    }
}