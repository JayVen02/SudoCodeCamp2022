import java.util.Scanner;

public class Java_Addition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input First Number: ");
		int n1 = input.nextInt();
		System.out.println("Input Second Number: ");
		int  n2 = input.nextInt();
		
		System.out.println(n1 + n2);
	}

}
