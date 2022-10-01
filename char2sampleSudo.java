
public class char2sampleSudo {

	public static void main(String[] args) {
		System.out.println("String1 " + " String2");
		System.out.println("JoVeN".toLowerCase());
		System.out.println("RosALes".toUpperCase());
		System.out.println("Hello World".contains("Hello"));
		//System.out.println("Hello World".substring(beginIndex: 2, endIndex: 4));
		String name = "sealed";
		
		char letter;
		
		String reversed = "";
		
		for (int i = 0; i < name.length(); i++) {
			letter = name.charAt(i);
			reversed = letter+reversed;
		}
		System.out.println(reversed);

	}

}
