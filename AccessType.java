
import java.lang.reflect.Field;

public class AccessType {
    private static int x = 5;

    public static class NestedTest {
        public static void doSomething() throws Exception {
            Field x = AccessType.class.getDeclaredField("x");
            //x.setAccessible(true);
            x.setInt(null, 10);
        }
    }

    public static void main(String[] args) throws Exception {
        NestedTest.doSomething();
        System.out.println(AccessType.x);
    }
}