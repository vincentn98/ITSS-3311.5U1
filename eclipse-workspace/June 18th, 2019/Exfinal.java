import java.util.Scanner;

public class Exfinal {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the statement");
		String s = input.nextLine();
		
		int k = s.indexOf(' ');
		String firstName=s.substring(0,k);
		String lastName=s.substring(k+1);
		
		System.out.println("First Name is "+firstName);
		System.out.println("Last Name is "+lastName);
		
		input.close();

	}

}
