import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter two characters: ");
		String s = input.nextLine();
		s = s.toLowerCase();

		if (s.charAt(0) == 'b' && s.charAt(1) == '1')
			System.out.println("Biology\nFreshman");
		if (s.charAt(0) == 'b' && s.charAt(1) == '2')
			System.out.println("Biology\nSophmore");
		if (s.charAt(0) == 'b' && s.charAt(1) == '3')
			System.out.println("Biology\nJunior");
		if (s.charAt(0) == 'b' && s.charAt(1) == '4')
			System.out.println("Biology\nSenior");
		else if (s.charAt(0) == 'c' && s.charAt(1) == '1')
			System.out.println("Computer Science\nFreshman");
		else if (s.charAt(0) == 'c' && s.charAt(1) == '2')
			System.out.println("Computer Science\nSophmore");
		else if (s.charAt(0) == 'c' && s.charAt(1) == '3')
			System.out.println("Computer Science\nJunior");
		else if (s.charAt(0) == 'c' && s.charAt(1) == '4')
			System.out.println("Computer Science\nSenior");
		else if (s.charAt(0) == 'i' && s.charAt(1) == '1')
			System.out.println("Information Technology and Systems\nFreshman");
		else if (s.charAt(0) == 'i' && s.charAt(1) == '2')
			System.out.println("Information Technology and Systems\nSophmore");
		else if (s.charAt(0) == 'i' && s.charAt(1) == '3')
			System.out.println("Information Technology and Systems\nJunior");
		else if (s.charAt(0) == 'i' && s.charAt(1) == '4')
			System.out.println("Information Technology and Systems\nSenior");
		else if (s.charAt(0) == 'm' && s.charAt(1) == '1')
			System.out.println("Marketing\nFreshman");
		else if (s.charAt(0) == 'm' && s.charAt(1) == '2')
			System.out.println("Marketing\nSophmore");
		else if (s.charAt(0) == 'm' && s.charAt(1) == '3')
			System.out.println("Marketing\nJunior");
		else if (s.charAt(0) == 'm' && s.charAt(1) == '4')
			System.out.println("Marketing\nSenior");
		else if (s.charAt(0) == 'h' && s.charAt(1) == '1')
			System.out.println("Healthcare Management\nFreshman");
		else if (s.charAt(0) == 'h' && s.charAt(1) == '2')
			System.out.println("Healthcare Management\nSophmore");
		else if (s.charAt(0) == 'h' && s.charAt(1) == '3')
			System.out.println("Healthcare Management\nJunior");
		else if (s.charAt(0) == 'h' && s.charAt(1) == '4')
			System.out.println("Healthcare Management\nSenior");
		else if (s.charAt(0) == 'a' && s.charAt(1) == '1')
			System.out.println("Accounting\nFreshman");
		else if (s.charAt(0) == 'a' && s.charAt(1) == '2')
			System.out.println("Accounting\nSophmore");
		else if (s.charAt(0) == 'a' && s.charAt(1) == '3')
			System.out.println("Accounting\nJunior");
		else if (s.charAt(0) == 'a' && s.charAt(1) == '4')
			System.out.println("Accounting\nSenior");
		else if (s.charAt(0) == 'a' && s.charAt(1) == '4')
			System.out.println("Accounting\nSenior");
		
		input.close();
	}

}
