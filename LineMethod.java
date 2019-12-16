import java.util.stream.Collectors;
import java.util.Scanner;
public class LineMethod{
	public static void main(String[] args) throws Exception{
		//Scanner in = new Scanner(System.in);
		//System.out.println("Enter Your Lines: ");
		//String s = in.nextLine();
		String s = "I\nam\nSony";
		System.out.println(s);
		System.out.println(s.lines().collect(Collectors.toList()));
}
}
