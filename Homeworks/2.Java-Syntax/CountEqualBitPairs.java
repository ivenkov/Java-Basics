import java.util.Scanner;


public class CountEqualBitPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int count = 0;
		String numberBinary = Integer.toBinaryString(number);
		for (int i = 0; i < numberBinary.length()-1; i++) {
			if (numberBinary.charAt(i)==numberBinary.charAt(i+1)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
