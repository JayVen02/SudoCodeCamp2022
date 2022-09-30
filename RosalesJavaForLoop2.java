
public class RosalesJavaForLoop2 {

	public static void main(String[] args) {
		
		int Number = 12345, Rn = 0;
		System.out.println("Input Number: " + Number);

	    for(;Number != 0; Number /= 10) {
	      int digit = Number % 10;
	      Rn = Rn * 10 + digit;
	    }

	    System.out.println("Reversed Number: " + Rn);
	  }


	}


