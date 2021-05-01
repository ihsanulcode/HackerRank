import java.util.Scanner;

/*
 * 
 * In this challenge, you must read an integer, a double, and a String from stdin, then print the values 
 * according to the instructions in the Output Format section below. 
 * To make the problem a little easier, a portion of the code is provided for you in the editor.
 */
public class Java_Stdin_and_Stdout_II {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.nextLine();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
       
        
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
