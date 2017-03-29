/**
 * Created by Balázs on 2017. 03. 29..
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredSquare {

  public static void mainDraw(Graphics graphics){
    // draw a green 10x10 square to the canvas' center.

    graphics.setColor(Color.GREEN);
    graphics.drawRect((300 / 2) - (10 / 2), (300 / 2) - (10 / 2), 10, 10);

    graphics.setColor(Color.GRAY);
    graphics.drawLine(0, 150, 300, 150);
    graphics.setColor(Color.GRAY);
    graphics.drawLine(150, 0, 150, 300);
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
