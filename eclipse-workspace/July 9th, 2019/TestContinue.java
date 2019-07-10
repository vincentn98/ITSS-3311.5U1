
public class TestContinue {

	public static void main(String[] args) {
		int sum = 0;
		int number = 0;

		while (number < 4) {
			number++;
			sum+=number;
			if (number == 2 || number == 3)
				continue;
			sum+=number;
		}
		System.out.println("The sum is "+sum);
	}

}
