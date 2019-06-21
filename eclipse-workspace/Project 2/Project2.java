import java.util.Scanner;

public class Project2 {
	//Vincent Nguyen
	//ITSS 3311.5U1
	//The output of the 5 sample runs are:
	//Enter two characters: m1
	//Marketing
	//Freshman
	//
	//Enter two characters: h3
	//Healthcare Management
	//Junior
	//
	//Enter two characters: A2
	//Accounting
	//Sophomore
	//Enter two characters: C0
	//Computer Science
	//Invalid year status
	//
	//Enter two characters: t4
	//Invalid Major
	//Senior
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		System.out.print("Enter two characters: ");
		String s = input.nextLine();
		s = s.toLowerCase();

		//If the major is Biology
		if (s.charAt(0) == 'b')
		{
			if (s.charAt(1) == '1')
				System.out.println("Biology\nFreshman");
		}
		if (s.charAt(0) == 'b')
		{
			if (s.charAt(1) == '2')
				System.out.println("Biology\nSophomore");
		}
		if (s.charAt(0) == 'b')
		{
			if (s.charAt(1) == '3')
				System.out.println("Biology\nJunior");
		}
		if (s.charAt(0) == 'b')
		{
			if (s.charAt(1) == '4')
				System.out.println("Biology\nSenior");
		}
		if (s.charAt(0) == 'b')
		{
			if (s.charAt(1) != '1'&&s.charAt(1) != '2'&&s.charAt(1) != '3'&&s.charAt(1) != '4')
				System.out.println("Biology\nInvalid year status");
		}

		//If the major is Computer Science
		if (s.charAt(0) == 'c')
		{
			if (s.charAt(1) == '1')
				System.out.println("Computer Science\nFreshman");
		}
		if (s.charAt(0) == 'c')
		{
			if (s.charAt(1) == '2')
				System.out.println("Computer Science\nSophomore");
		}
		if (s.charAt(0) == 'c')
		{
			if (s.charAt(1) == '3')
				System.out.println("Computer Science\nJunior");
		}
		if (s.charAt(0) == 'c')
		{
			if (s.charAt(1) == '4')
				System.out.println("Computer Science\nSenior");
		}
		if (s.charAt(0) == 'c')
		{
			if (s.charAt(1) != '1'&&s.charAt(1) != '2'&&s.charAt(1) != '3'&&s.charAt(1) != '4')
				System.out.println("Computer Science\nInvalid year status");
		}
		//If the major is Information Technology and Systems
		if (s.charAt(0) == 'i')
		{
			if (s.charAt(1) == '1')
				System.out.println("Information Technology and Systems\nFreshman");
		}
		if (s.charAt(0) == 'i')
		{
			if (s.charAt(1) == '2')
				System.out.println("Information Technology and Systems\nSophomore");
		}
		if (s.charAt(0) == 'i')
		{
			if (s.charAt(1) == '3')
				System.out.println("Information Technology and Systems\nJunior");
		}
		if (s.charAt(0) == 'i')
		{
			if (s.charAt(1) == '4')
				System.out.println("Information Technology and Systems\nSenior");
		}
		if (s.charAt(0) == 'i')
		{
			if (s.charAt(1) != '1'&&s.charAt(1) != '2'&&s.charAt(1) != '3'&&s.charAt(1) != '4')
				System.out.println("Information Technology and Systems\nInvalid year status");
		}
		//If the major is Marketing
		if (s.charAt(0) == 'm')
		{
			if (s.charAt(1) == '1')
				System.out.println("Marketing\nFreshman");
		}
		if (s.charAt(0) == 'm')
		{
			if (s.charAt(1) == '2')
				System.out.println("Marketing\nSophomore");
		}
		if (s.charAt(0) == 'm')
		{
			if (s.charAt(1) == '3')
				System.out.println("Marketing\nJunior");
		}
		if (s.charAt(0) == 'm')
		{
			if (s.charAt(1) == '4')
				System.out.println("Marketing\nSenior");
		}
		if (s.charAt(0) == 'm')
		{
			if (s.charAt(1) != '1'&&s.charAt(1) != '2'&&s.charAt(1) != '3'&&s.charAt(1) != '4')
				System.out.println("Marketing\nInvalid year status");
		}
		//If the major is Healthcare Management
		if (s.charAt(0) == 'h')
		{
			if (s.charAt(1) == '1')
				System.out.println("Healthcare Management\nFreshman");
		}
		if (s.charAt(0) == 'h')
		{
			if (s.charAt(1) == '2')
				System.out.println("Healthcare Management\nSophomore");
		}
		if (s.charAt(0) == 'h')
		{
			if (s.charAt(1) == '3')
				System.out.println("Healthcare Management\nJunior");
		}
		if (s.charAt(0) == 'h')
		{
			if (s.charAt(1) == '4')
				System.out.println("Healthcare Management\nSenior");
		}
		if (s.charAt(0) == 'h')
		{
			if (s.charAt(1) != '1'&&s.charAt(1) != '2'&&s.charAt(1) != '3'&&s.charAt(1) != '4')
				System.out.println("Healthcare Management\nInvalid year status");
		}
		//If the major is Accounting
		if (s.charAt(0) == 'a')
		{
			if (s.charAt(1) == '1')
				System.out.println("Accounting\nFreshman");
		}
		if (s.charAt(0) == 'a')
		{
			if (s.charAt(1) == '2')
				System.out.println("Accounting\nSophomore");
		}
		if (s.charAt(0) == 'a')
		{
			if (s.charAt(1) == '3')
				System.out.println("Accounting\nJunior");
		}
		if (s.charAt(0) == 'a')
		{
			if (s.charAt(1) == '4')
				System.out.println("Accounting\nSenior");
		}
		if (s.charAt(0) == 'a')
		{
			if (s.charAt(1) != '1'&&s.charAt(1) != '2'&&s.charAt(1) != '3'&&s.charAt(1) != '4')
				System.out.println("Accounting\nInvalid year status");
		}
		//If the major is an Invalid Major
		if (s.charAt(0) != 'b'&&s.charAt(0) != 'c'&&s.charAt(0) != 'i'&&s.charAt(0) != 'm'&&s.charAt(0) != 'h'&&s.charAt(0) != 'a')
		{
			if (s.charAt(1) == '1')
				System.out.println("Invalid Major\nFreshman");
		}
		if (s.charAt(0) != 'b'&&s.charAt(0) != 'c'&&s.charAt(0) != 'i'&&s.charAt(0) != 'm'&&s.charAt(0) != 'h'&&s.charAt(0) != 'a')
		{
			if (s.charAt(1) == '2')
				System.out.println("Invalid Major\nSophomore");
		}
		if (s.charAt(0) != 'b'&&s.charAt(0) != 'c'&&s.charAt(0) != 'i'&&s.charAt(0) != 'm'&&s.charAt(0) != 'h'&&s.charAt(0) != 'a')
		{
			if (s.charAt(1) == '3')
				System.out.println("Invalid Major\nJunior");
		}
		if (s.charAt(0) != 'b'&&s.charAt(0) != 'c'&&s.charAt(0) != 'i'&&s.charAt(0) != 'm'&&s.charAt(0) != 'h'&&s.charAt(0) != 'a')
		{
			if (s.charAt(1) == '4')
				System.out.println("Invalid Major\nSenior");
		}
		if (s.charAt(0) != 'b'&&s.charAt(0) != 'c'&&s.charAt(0) != 'i'&&s.charAt(0) != 'm'&&s.charAt(0) != 'h'&&s.charAt(0) != 'a')
		{
			if (s.charAt(1) != '1'&&s.charAt(1) != '2'&&s.charAt(1) != '3'&&s.charAt(1) != '4')
				System.out.println("Invalid Major\nInvalid year status");
		}
		input.close();

	}

}
