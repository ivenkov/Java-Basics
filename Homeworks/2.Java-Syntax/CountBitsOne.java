import java.util.Scanner;


public class CountBitsOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int count = Integer.bitCount(number);
		System.out.println(count);
	}

}
