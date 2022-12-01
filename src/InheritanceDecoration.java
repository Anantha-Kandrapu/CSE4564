import java.awt.Graphics2D;
import java.awt.Color;

/**
 * This class implements the Decorator Pattern. It adds the arrowhead for inheritance
 * over the basic line.
 */

public class InheritanceDecoration extends JustLineDecorator {

    int[] ix = new int[3];
    int[] iy = new int[3];

    public InheritanceDecoration(Arrow arrow) {
        super(arrow);
    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        Graphics2D g2d = (Graphics2D) RightPanel.rightPanel.getGraphics();
        super.drawLine(x1, y1, x2, y2);
        double d = 10;
        double h = 15;
        int dx = x2 - x1, dy = y2 - y1;
        double D = Math.sqrt(dx * dx + dy * dy);
        double t = h / D;

        double xt = (1 - t) * x2 + t * x1;
        double yt = (1 - t) * y2 + t * y1;
        double m2 = (x1 - x2) / (y2 - y1);

        double sqrt = Math.sqrt(d * d / (m2 * m2 + 1));
        double y3 = m2 * sqrt + yt;
        double x3 = xt + sqrt;

        double y4 = yt - m2 * sqrt;
        double x4 = xt - sqrt;

        int[] xpoints = { x2, (int) x3, (int) x4 };
        int[] ypoints = { y2, (int) y3, (int) y4 };

        g2d.setColor(Color.getHSBColor(184, 172, 232));
        g2d.fillPolygon(xpoints, ypoints, 3);
        g2d.setColor(Color.BLUE);
        g2d.drawPolygon(xpoints, ypoints, 3);
    }

}
