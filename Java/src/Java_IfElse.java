import java.util.Scanner;

//In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes.
public class Java_IfElse {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2!=0)
            System.out.println("Weird");
        else{
            if(N>=2 && N<= 5)
                System.out.println("Not Weird");
            if(N>=6 && N<= 20)
                System.out.println("Weird");
            if(N>20)
                System.out.println("Not Weird");
        }
             
        scanner.close();
    }

}
