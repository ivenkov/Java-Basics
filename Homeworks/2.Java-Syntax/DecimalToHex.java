import java.util.Scanner;


public class DecimalToHex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		String numberHex = Integer.toHexString(number);
		System.out.printf("%S%n", numberHex);
		//System.out.println(numberHex);
	}

}
