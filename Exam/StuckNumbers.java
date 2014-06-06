import java.util.Scanner;


public class StuckNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		int n = input.nextInt();
		input.nextLine();
		String inputNumbers = input.nextLine();
		String[] numbers = inputNumbers.split(" ");
		for (String a : numbers) {
			for (String b : numbers) {
				for (String c : numbers) {
					for (String d : numbers) {
						if (a.compareTo(b) != 0 && a.compareTo(c) !=0 && 
								a.compareTo(d)  !=0 && b.compareTo(c) !=0 && 
								b.compareTo(d) != 0 && c.compareTo(d) !=0) {
							String leftApended = a + b;
							String rightApended = c + d;
							if (leftApended.equals(rightApended)) {
								System.out.printf("%s|%s==%s|%s\n", a, b, c, d);
								count++;
							}
						}
					}
				}
			}
		}
		if (count == 0) {
			System.out.println("No");
		}
	}

}
