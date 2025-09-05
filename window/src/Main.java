import javax.swing.*;
import java.awt.Graphics;

public class Main extends JPanel {
	
	public void paint(Graphics graphics) {
		int x = 20;
		int y = 20;
		int width = 280;
		int height = 140;
		
		int points = 4;
		graphics.drawRect(x, y, width, height);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello world");
		frame.getContentPane().add(new Main());
		frame.setSize(320, 180);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
	}
}
