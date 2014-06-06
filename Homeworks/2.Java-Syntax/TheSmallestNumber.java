import java.util.Scanner;


public class TheSmallestNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float numbers [] = new float[3];
		numbers[0] = input.nextFloat();
		float smallestNumber = numbers[0];
		int index = 1;
		do {
			numbers[index] = input.nextFloat();
			if (numbers[index] < smallestNumber) {
				smallestNumber = numbers[index];
			}
			index++;
		} while (index < 3);
		System.out.println(smallestNumber);
	}

}
