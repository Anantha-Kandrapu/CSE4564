import java.util.ArrayList;

import javax.swing.JTextArea;

public class SubLeftPanel extends JTextArea {
    String classNameText;
    ArrayList<String> relationsText;
    Box box;
    int rows, cols;

    public SubLeftPanel() {
        setLineWrap(true);
        relationsText = new ArrayList<>();
    }

    public SubLeftPanel setSubLeftPanelRows(int rows) {
        super.setRows(rows);
        return this;
    }

    public SubLeftPanel setSubLeftPanelCols(int cols) {
        super.setColumns(cols);
        return this;
    }

    public String getRelationsText() {
        String relations = "";
        for (String s : relationsText) {
            relations = relations + "\n" + s + "\n";
        }
        return relations;
    }

    public void setCodeText() {
        String generatedString = "class " + classNameText + " { \n" + getRelationsText() + "\n}";
        setText(generatedString);
    }

    public String getClassNameText() {
        return classNameText;
    }

    public void setClassNameText(String classNameText) {
        this.classNameText = classNameText;
    }

    public void setRelationsText(String relationsText) {
        String assocaitoString = "\t method() {\n \t\t" + relationsText + "\n \t}";
        this.relationsText.add(assocaitoString);
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    @Override
    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

}