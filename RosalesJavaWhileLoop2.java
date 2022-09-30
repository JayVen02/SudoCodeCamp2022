import java.util.Scanner;

public class RosalesJavaWhileLoop2 {

	public static void main(String[] args) {
		
		int a = 12345, Rn = 0;

		System.out.println("Input Number: " + a);
		
		while( a != 0)
		{
			Rn = Rn * 10;
			Rn = Rn + a%10;
			a = a/10;
		}
		
		System.out.println("Reversed: " + Rn);
		}

	}

