import java.util.Scanner;


public class PointsInside {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float x = input.nextFloat();
		float y = input.nextFloat();
		boolean inside = insideFirst(x,y);
		boolean outside = outsideSecond(x,y);
		if (inside) {
			if (outside) {
				System.out.println("Inside");
			} else {
				System.out.println("Outside");
			}
		} else {
			System.out.println("Outside");
		}
	}

	private static boolean outsideSecond(float x, float y) {
		if (y <= 8.5 || x >= 20 || x <= 17.5) {
			return true;
		} else {
			return false;
		}
		
	}

	private static boolean insideFirst(float x, float y) {
		if (x >= 12.5 && x <= 22.5 && y >= 6 && y <= 13.5) {
			return true;
		} else {
			return false;
		}
		
	}

}
