import java.util.Scanner;
import java.lang.*;

public class FormattingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		float b = input.nextFloat();
		float c = input.nextFloat();
		String numberBinary = Integer.toBinaryString(a);
		numberBinary = String.format("%10s", numberBinary).replace(' ', '0');
		String numberHex = Integer.toHexString(a);
		System.out.printf("|%-10S|%S|%10.2f|%-10.3f|", numberHex, numberBinary, b, c);
		//System.out.printf("||", );
	}

}
