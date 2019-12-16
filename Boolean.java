import java.util.*;
import java.util.Scanner;

public class Boolean{

/*
isBlank() – This instance method returns a boolean value.
Empty Strings and Strings with only white spaces are treated as blank.
*/

    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String a = in.nextLine();
        System.out.println("The Boolean of Your Entered String is: "+a.isBlank());

        System.out.println("Enter another string: ");
        String b = in.nextLine();
        System.out.println("The Boolean of Your Entered String is: "+b.isBlank());

        System.out.println("Enter another string: ");
        String c = in.nextLine();
        System.out.println("The Boolean of Your Entered String is: "+c.isBlank());
    }

}


