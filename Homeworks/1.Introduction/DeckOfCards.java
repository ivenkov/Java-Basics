import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;


public class DeckOfCards {

	public static void main(String[] args) {
		String FILE = "Deck-of-Cards.pdf";
		
		try {
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream(FILE));
			document.open();
			addContent(document);
			document.close();
			} catch (Exception e) {
			e.printStackTrace();
			}
	}

	private static void addContent(Document document) 
			throws DocumentException, IOException {
		// Font
		BaseFont baseFont = BaseFont.createFont("times.ttf", BaseFont.IDENTITY_H, true);
		Font black = new Font(baseFont, 34f, 0, BaseColor.BLACK);
        Font red = new Font(baseFont, 34f, 0, BaseColor.RED);
        
		PdfPTable table = new PdfPTable(7);
		table.setWidthPercentage(100);
		
		PdfPCell cell = new PdfPCell();
		
		char spades = '\u2660';
		char hearts = '\u2665';
		char diamonds = '\u2666';
		char clubs = '\u2663';
		String content;
		String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		
		for (int i = 0; i < 25; i++) {
			if (i%2 == 1) {
				for (int j = 0; j < 7; j++) {
					cell = new PdfPCell(new Phrase(""));
					cell.setHorizontalAlignment(Element.ALIGN_CENTER);
					cell.setBorder(Rectangle.NO_BORDER);
					cell.setFixedHeight(100);
				    table.addCell(cell);
				}
			} else {
				content = cards[i/2] + hearts;
				cell = new PdfPCell(new Phrase(content,red));
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);    
			    cell.setFixedHeight(100);
			    cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			    table.addCell(cell);
			    
			    cell = new PdfPCell(new Phrase(""));
			    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			    cell.setBorder(Rectangle.NO_BORDER);
			    cell.setFixedHeight(100);
			    table.addCell(cell);
			    
			    content = cards[i/2] + spades;
			    cell = new PdfPCell(new Phrase(content,black));
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);    
			    cell.setFixedHeight(100);
			    cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			    table.addCell(cell);
			    
			    cell = new PdfPCell(new Phrase(""));
			    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			    cell.setBorder(Rectangle.NO_BORDER);
			    cell.setFixedHeight(100);
			    table.addCell(cell);
			    
			    content = cards[i/2] + diamonds;
			    cell = new PdfPCell(new Phrase(content,red));
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);    
			    cell.setFixedHeight(100);
			    cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			    table.addCell(cell);
			    
			    cell = new PdfPCell(new Phrase(""));
			    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			    cell.setBorder(Rectangle.NO_BORDER);
			    cell.setFixedHeight(100);
			    table.addCell(cell);
			    
			    content = cards[i/2] + clubs;
			    cell = new PdfPCell(new Phrase(content,black));
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);    
			    cell.setFixedHeight(100);
			    cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			    table.addCell(cell);

			}
		}
	
		document.add(table);

	}

}
