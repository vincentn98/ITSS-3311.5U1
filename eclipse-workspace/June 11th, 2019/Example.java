import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double area;
		double volume;

		System.out.println("Enter a number for radius");
		double radius = input.nextDouble();

		System.out.println("Enter a number for length");
		double length  = input.nextDouble();

		System.out.println("Enter value of PI");
		final double PI = input.nextDouble ();

		// TODO Auto-generated method stub

		//Compute area
		area = radius* radius*PI;

		//Compute Volume
		volume = area*length;

		//Display results
		System.out.println("The volume for the cylinder with radius "+radius+" and "+" length "+length+" is "+volume);

		input.close();
		
	}

}
