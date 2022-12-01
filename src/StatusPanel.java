import java.util.ArrayList;
import javax.swing.JTextArea;
import java.awt.*;

public class StatusPanel extends JTextArea implements Observer {

    int prevBoxLength = 0;
    int prevRelationLength = 0;

    public StatusPanel() {
        Font font = new Font("Segoe Script", Font.BOLD, 20);
        setFont(font);
        setForeground(Color.BLUE);
    }

    @Override
    public void update(ArrayList<Box> boxes, ArrayList<RelationShip> relationShip) {
        String update = "";
        if (boxes.size() != prevBoxLength) {
            update += "Added new Class " + boxes.get(prevBoxLength).getClassName();
            prevBoxLength = boxes.size();
        }
        if (relationShip.size() != prevRelationLength) {
            RelationShip x = relationShip.get(prevRelationLength);
            update += " Added new " + x.getType() + " from " + x.getBox1().getClassName() + " to "
                    + x.getBox2().getClassName();
            prevRelationLength = relationShip.size();
        }
        setText(update);
    }

}
