import java.util.Scanner;

/*
 * 
 * Java's System.out.printf function can be used to print formatted output. 
 * The purpose of this exercise is to test your understanding of formatting output using printf.
 * To get you started, a portion of the solution is provided for you in the editor; 
 * you must format and print the input to complete the solution.
 */
public class Java_Output_Formatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			int length = 15 - s1.length();

			System.out.print(s1);
			for (int l = 1; l <= length; l++) {
				System.out.print(" ");
			}

			if (x < 10)
				System.out.print("00" + x);
			else if (x < 100)
				System.out.print("0" + x);
			else if (x >= 100)
				System.out.print(x);
			else
				System.out.print("\t" + x);
			System.out.println();
		}

		System.out.println("================================");

	}

}
