import java.util.Scanner;

/**
 * 
 */

/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name;
		HelloUser user;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Hello ASE2015 - how are you now :)" );
		System.out.print("Please enter your name:" );
		
		name = in.nextLine();
		user = new HelloUser(name);
		user.greetUser();
		
		in.close();       
	}

}
