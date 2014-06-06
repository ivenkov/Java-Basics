import java.util.Scanner;


public class SumCards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String handOfCards = input.nextLine();
		String[] faces = handOfCards.split("[S,H,D,C, ]+");
		int handValue = 0;
		                
		if (faces.length == 1) {
			System.out.println(faces[0]);
		} else {
			int index = 1;
			do {
				int seqCount = 1;
				int flag = index;
				while (getCardValue(faces[flag]) == getCardValue(faces[flag - 1])) {
					seqCount++; 
					if (flag < faces.length - 1) {
						flag++;
					} else {
						break;
					}
				}
				if (seqCount > 1) {
					handValue = handValue + getCardValue(faces[index - 1]) * seqCount *2;
				} else {
					handValue = handValue + getCardValue(faces[flag - 1]);
				}
					
				if (flag == faces.length - 1 && seqCount == 1) {
					handValue = handValue + getCardValue(faces[flag]);
				}
				index = flag + 1;
			} while (index < faces.length);
			System.out.println(handValue);
		}
		
	}

	
	
	
	private static int getCardValue(String face) {
		int value;
		switch(face){
		case "A": value = 15; break;
		case "K": value = 14; break;
		case "J": value = 12; break;
		case "Q": value = 13; break;
		default : value = Integer.parseInt(face); break;
		}
		
		return value;
	}

}
