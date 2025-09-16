import javax.swing.*;
import java.awt.Graphics;

public class Main extends JPanel {
  public void paint(Graphics graphics) {
    int x = 80;
    int y = 80;
    int width = 80;

  }
  public static void main(String[] args) {
    JFrame frame = new JFrame("Clock");
    frame.getContentPane().add(new Main());
    frame.setSize(160, 160);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setResizable(false);

    frame.update(frame.getContentPane());
  }
}
