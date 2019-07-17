
public class MethodsEx1 {

	public static void main(String[] args) {
		System.out.println("Sum from 3 and 10 is " + sum(3,10));
		System.out.println("Sum from 50 and 30 is " + sum(50,30));
		System.out.println("Sum from 5 and 4 is " + sum(5,4));
	}
	
	public static int sum(int num1, int num2) {
		int result;
		if (num1>num2)
			result=num1;
		else
			result=num2;
		return result;
	}
}
