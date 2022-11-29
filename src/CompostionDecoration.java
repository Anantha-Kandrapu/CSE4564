
import java.awt.Graphics;
public class CompostionDecoration extends JustLineDecorator {

    public CompostionDecoration(Arrow arrow) {
        super(arrow);
    }

    int[] ix = new int[4];
    int[] iy = new int[4];

    public void drawLine(int x1, int y1, int x2, int y2) {
        Graphics g = RightPanel.rightPanel.getGraphics();
        super.drawLine(x1, y1, x2, y2);
        ix[0] = x1;
        iy[0] = y1;
        ix[1] = x1 - 10;
        iy[1] = y1 - 10;
        ix[3] = x1 + 10;
        iy[3] = y1 - 10;
        ix[2] = x1;
        iy[2] = y1 - 10; 
        for(int i =0 ; i < 4; ++i){
            System.out.println("X : "+ix[i]+" Y :"+iy[i]);
        }
        g.drawPolygon(ix, iy, 4);
    }
}
