import java.util.Scanner;

public class StrictlyIdentical {
	//Vincent Nguyen
	//ITSS 3311.5U1
	//The output of the sample run is:
	//Enter 5 elements of list1: 1
	//2
	//3
	//4
	//5
	//Enter 5 elements of list2: 1
	//2
	//3
	//4
	//5
	//Two lists are strictly identical.
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		//Declaring and creating two arrays list1 and list2 of integer type and size 5.
		int[] list1 = new int[5];
		int[] list2 = new int[5];

		//Prompting the user to enter 5 elements of list1. 
		System.out.print("Enter 5 elements of list1: ");
		//Using for loop to read these entries and assign them to the elements of list1. 
		for (int i=0;i<5;i++) {
			list1[i] = input.nextInt();
		}
		//Prompting the user to enter 5 elements of list2. 
		System.out.print("Enter 5 elements of list2: ");
		//Using for loop to read these entries and assign them to the elements of list2.
		for (int i=0;i<5;i++) {
			list2[i] = input.nextInt();
		}
		//Passing the reference of list1 and list2 to the array variables array1 and array2.
		equals(list1,list2);

		//If the return type from method equals is true, displays that the lists are strictly identical
		//otherwise, displays that the lists are not strictly identical.
		if (equals(list1, list2))
			System.out.println("Two lists are strictly identical.");
		else
			System.out.println("Two lists are not strictly identical.");

		input.close();

	}

	//Method equals outside the main method
	public static boolean equals(int[] array1, int[] array2) {
		//Using for loop to check the corresponding elements of array1 and array2.
		//For loop will iterate as long as the index is less than the length
		//of the arrays and the boolean method equals does not return false.
		for (int i=0;i<5;i++) {
			if (array1[i] != array2[i])
				return false;

		}
		return true;

	}

}
