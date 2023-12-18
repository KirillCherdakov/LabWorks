package lab_work10;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.Timer;

public class LabWork10 extends JPanel {
  GeneralPath shape;

  private AffineTransform transformers;

  Random r = new Random();

  final double y = r.nextInt(100);
  final double x = r.nextInt(100);

  double x1 = x + 100;
  double y1 = y + 100;

  public LabWork10() {
    setPreferredSize(new Dimension(400, 400));
    GeneralPath path = new GeneralPath();

    path.append(new Ellipse2D.Double(x1++, y1++, 4, 4), false);
    path.append(new Line2D.Double(x1 + 100, y1 + 100, x1 - 100, y1 - 100), false);

    Timer tm = new Timer(100, new ActionListener() {
      int i = 0;

      @Override
      public void actionPerformed(ActionEvent e) {
        transformers = AffineTransform.getRotateInstance(i++ * 0.05, x1, y1);

        repaint();
      }
    });
    tm.start();
    shape = path;
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;

    g2.transform(transformers);

    g2.draw(shape);
  }

  public static void lab5() {
    JFrame fr = new JFrame("Программа");
    JPanel pan = new LabWork10();
    fr.setPreferredSize(new Dimension(400, 400));
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JScrollPane sp = new JScrollPane(pan);
    fr.add(sp);
    fr.pack();
    fr.setVisible(true);
  }
}