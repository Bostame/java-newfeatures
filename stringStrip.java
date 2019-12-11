/** 
 * Demonstrate method {@code String.strip()} added with JDK 11. 
 */  

public class stringStrip{
	public static void main(String []args){		
		String s2 = "  Hello,  \tWorld\t ";
		System.out.println("Main String output:");
		System.out.println("#" + s2 + "#");
		System.out.println("Äfter Applying stripLeading()  method");
		System.out.println("#" + s2.stripLeading() + "#");

	}	

}
