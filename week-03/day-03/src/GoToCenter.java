/**
 * Created by Balázs on 2017. 03. 29..
 */
import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class GoToCenter {


  public static void mainDraw(Graphics graphics) {
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // draw 3 lines with that function.

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the starting x coordinate: ");
    int xcoord = scanner.nextInt();
    //System.out.println(xcoord);

    System.out.println("Enter the starting y coordinate: ");
    int ycoord = scanner.nextInt();
    //System.out.println(ycoord);

    drawMyLine(graphics, xcoord, ycoord);



  }

  public static void drawMyLine(Graphics g, int x, int y) {

    g.setColor(Color.RED);
    g.drawLine(x, y, 150, 150);

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
