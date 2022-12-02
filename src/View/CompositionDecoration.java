package View;

import Controller.*;
import Model.*;

import java.awt.Color;
import java.awt.Graphics2D;

public class CompositionDecoration extends JustLineDecorator {

    public CompositionDecoration(Arrow arrow) {
        super(arrow);
    }

    public void drawLine(int x1, int y1, int x2, int y2) {
        Graphics2D g2d = (Graphics2D) RightPanel.rightPanel.getGraphics();
        super.drawLine(x1, y1, x2, y2);
        double d = 10, height = 15;
        int dx = x2 - x1, dy = y2 - y1;
        double dist = Math.sqrt(dx * dx + dy * dy);
        double t = height / dist;
        double t1 = 2 * height / dist;

        double xt = (1 - t) * x2 + t * x1;
        double yt = (1 - t) * y2 + t * y1;
        double m2 = 0.0;

        try {
            m2 = (x1 - x2) / (y2 - y1);
        }
        catch (ArithmeticException e){
            System.out.println("Compostiiton");
        }
        double sqrt = Math.sqrt(d * d / (m2 * m2 + 1));
        double y3 = m2 * sqrt + yt;
        double x3 = xt + sqrt;

        double y4 = yt - m2 * sqrt;
        double x4 = xt - sqrt;

        double x5 = (1 - t1) * x2 + t1 * x1;
        double y5 = (1 - t1) * y2 + t1 * y1;

        int[] xPoints = { x2, (int) x3, (int) x5, (int) x4 };
        int[] yPoints = { y2, (int) y3, (int) y5, (int) y4 };

        g2d.setColor(Color.BLACK);
        g2d.fillPolygon(xPoints, yPoints, 4);
    }
    
}
