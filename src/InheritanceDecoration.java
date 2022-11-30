import java.awt.Graphics;


public class InheritanceDecoration extends JustLineDecorator {

    int[] ix = new int[3];
    int[] iy = new int[3];

    public InheritanceDecoration(Arrow arrow) {
        super(arrow);
        // setLayout(null);
        // setBounds(arrow.getBoundX(), arrow.getBoundY(), arrow.getBoundW()+20,
        // arrow.getBoundH()+20);
    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        Graphics g = RightPanel.rightPanel.getGraphics();
        super.drawLine(x1, y1, x2, y2);
        ix[0] = x2 + 10;
        iy[0] = y2;
        ix[1] = x2;
        iy[1] = y2 + 10;
        ix[2] = x2;
        iy[2] = y2 - 10;
        g.drawPolygon(ix, iy, 3);
        g.dispose();
    }
}
