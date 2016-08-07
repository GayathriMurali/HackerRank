import java.io.*;

public class Staircase {

	public static void main(String[] args) {
		int N = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter N :");
		try {
			N = Integer.parseInt(br.readLine());
			if (!(N > 0))
				System.out.println("invalid input");
		} catch (NumberFormatException e) {

			System.err.println("Invalid number format " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Invalid input " + e.getMessage());
		}
		for (int i = 1; i <= N; i++) {

			if (i % 3 == 0  && i % 5 == 0)
				System.out.println("FizzBuzz");
			else if (i % 3 == 0)
				System.out.println("Fizz");
			else if (i % 5 == 0)
				System.out.println("Buzz");

			else
				System.out.println(i);
		}
	}
}
