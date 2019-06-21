import java.util.*;
public class Example3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value to x");
		int x = input.nextInt();
		
		if (x%2 == 0)
			System.out.println("HiEven");
		if (x%5 == 0)
			System.out.println("HiFive");
		
		input.close();
	}
}
