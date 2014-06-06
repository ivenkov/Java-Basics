import java.util.Arrays;
import java.util.Scanner;


public class SortStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] cityNames = new String[n];
		input.nextLine();
		for (int i = 0; i < n; i++) {
			cityNames[i] = input.nextLine();
		}
		Arrays.sort(cityNames);
		for (int i = 0; i < n; i++) {
			System.out.println(cityNames[i]);
		}

	}

}
