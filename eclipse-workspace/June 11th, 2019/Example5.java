import java.util.Scanner;
public class Example5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number for x");
		int x = input.nextInt();
		System.out.println("Enter a number for y");
		int y = input.nextInt();

		switch (x+3) {
		case 5 : y = 0;
		break;
		case 6 : y = 1;
		break;
		default: y += 1;
		}
		System.out.println("The value of y is "+y);

		input.close();
	}
}
