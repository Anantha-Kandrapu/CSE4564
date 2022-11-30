import java.awt.Color;
import java.awt.Graphics2D;

public class CompostionDecoration extends JustLineDecorator {

    public CompostionDecoration(Arrow arrow) {
        super(arrow);
    }


    public void drawLine(int x1, int y1, int x2, int y2) {
        Graphics2D g2d = (Graphics2D) RightPanel.rightPanel.getGraphics();
        super.drawLine(x1, y1, x2, y2);
        // for (int i = 0; i < 4; ++i) {
        // System.out.println("X : " + ix[i] + " Y :" + iy[i]);
        // }

        g2d.setColor(Color.BLACK);
        g2d.drawRect(x1 - 15, y1 - 15, 15, 15);
        g2d.fillRect(x1 - 15, y1 - 15, 15, 15);
    }
}
