import java.util.*;
public class Example2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double area;
		
		System.out.println("Enter a value to radius");
		double radius = input.nextDouble();
		
		System.out.println("Enter a value to PI");
		final double PI = input.nextDouble();
		
		if (radius >= 0) {
			area = radius*radius*PI;
			System.out.println("The area of a circle with radius "+radius+ " is "+area);
		}
		input.close();
	}

}
