import java.util.Scanner;

/*
 * Most HackerRank challenges require you to read input from stdin (standard input) and write output to stdout (standard output).
One popular way to read input from stdin is by using the Scanner class and specifying the Input Stream as System.in.
 */
public class Java_Stdin_and_Stdout_I {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		scan.close();
	}

}
