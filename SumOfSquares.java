import java.util.Scanner;

public class SumOfSquares {

	public static void main(final String... args) {
		Scanner scanner = new Scanner(System.in);

		double number, result = 0;

		while ((number = scanner.nextInt()) != 0) {

			result += number * number;
		}


		System.out.println(result);

		scanner.close();
	}
}
