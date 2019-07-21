import java.util.Scanner;

public class CheckPassword {
	//Vincent Nguyen
	//ITSS 3311.5U1
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		//Prompting the user to enter a password and displays Valid password
		//if the rules are followed or Invalid password otherwise.
		System.out.print("Enter your password: ");
		String p = input.nextLine();
		if (AtLeast8(p) == true && LetterOrDigit(p) == true && AtLeast2Digits(p) == true)
			System.out.println("Valid password");
		else
			System.out.println("Invalid password");

		input.close();

	}

	//Checking if the password is at least 8 characters long.
	public static boolean AtLeast8(String p) {
		if (p.length() < 8)
			return false;
		else
			return true;

	}

	//Checking if the password consists of only letters and digits.
	public static boolean LetterOrDigit(String p) {
		int i = 0;
		while (i<=p.length()) {
			if 	(Character.isLetterOrDigit(p.charAt(i)) == false)
				return false;
			else
				i+=1;
			if (i==p.length())
				break;
		}
		return true;

	}

	//Checking if the password contains at least two digits.
	public static boolean AtLeast2Digits(String p) {
		int i = 0;
		int count = 0;
		while (count<=p.length()) {
			if (Character.isDigit(p.charAt(i)) == true)
				count+=1;
			i+=1;
			if (count>=2)
				return true;
			if (i<p.length())
				continue;
			else if (i==p.length() && count<2);
			break;

		}

		return false;
	}

}
