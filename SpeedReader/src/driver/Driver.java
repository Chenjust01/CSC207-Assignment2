import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws InterruptedException, IOException {
		WordGenerator generate = new WordGenerator(args[0]);
		int width = Integer.valueOf(args[1]);
		int height = Integer.valueOf(args[2]);
		int fontsize = Integer.valueOf(args[3]);
		int wpm = Integer.valueOf(args[4]);
		DrawingPanel panel = new DrawingPanel(width, height);
		while (generate.hasNext()) {
			//DrawingPanel panel = new DrawingPanel(width, height);
			demonstratePanel(panel, generate.next(), height, width, fontsize);
			Thread.sleep(60000/wpm);
			panel.clear();
		}
	}

	public static void demonstratePanel(DrawingPanel panel, String word, int height, int width, int fontsize) {
		  Graphics g = panel.getGraphics();
		  Font f = new Font("Courier", Font.BOLD, fontsize);
		  
		  g.setFont(f);
		  g.drawString(word, 100, 100);
		  
	
		}

}
