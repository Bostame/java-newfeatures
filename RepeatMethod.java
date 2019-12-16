import java.util.stream.Collectors;
import java.util.Scanner;
public class RepeatMethod{
        public static void main(String[] args) throws Exception{
                Scanner in = new Scanner(System.in);
                System.out.println("Enter Your Lines: ");
                String s = in.nextLine();
		String q = s.repeat(3);
                //String s = "I\nam\nSony";
                System.out.println(q);
                //System.out.println(s.lines().collect(Collectors.toList()));
}
}

