import java.util.Scanner;

public class ExString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the statement");
		String s1 = input.nextLine();
		
		int s2=s1.indexOf('i');
		
		System.out.println(s2);
		
		int s3=s1.lastIndexOf('i');
		
		System.out.println(s3);

		input.close();

	}

}
