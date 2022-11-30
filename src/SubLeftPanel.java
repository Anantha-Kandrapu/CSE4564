import java.util.ArrayList;

import javax.swing.JTextArea;

public class SubLeftPanel extends JTextArea {
    String classNameText;
    ArrayList<String> association;
    Box box;
    ArrayList<String> inheritance;
    ArrayList<String> composition;


    public SubLeftPanel(int rows, int cols) {
        super(rows, cols);
        setLineWrap(true);
        association = new ArrayList<>();
        inheritance = new ArrayList<>();
        composition = new ArrayList<>();
    }

    public String getAssociationText() {
        String relations = "";
        for (String s : association) {
            relations = relations + "\n" + s + "\n";
        }
        return relations;
    }
    public String getInheritanceText() {
    	if(inheritance.size()==0) return "";
        String relations = " extends ";
        for (String s : inheritance) {
            relations = relations + s ;
        }
        return relations;
    }

    public String getCompositionText() {
        String relations = "";
        for (String s : composition) {
            relations = relations + s + "\n";
        }
        return relations;
    }

    public void setCodeText() {
    	
        String generatedString = "class " + classNameText + getInheritanceText() + " { \n" + getCompositionText() + getAssociationText() + "\n}";
        setText(generatedString);
    }
    

    public String getClassNameText() {
        return classNameText;
    }

    public void setClassNameText(String classNameText) {
        this.classNameText = classNameText;
    }

    public void setAssociationText(String relationsText) {
        String assocaitoString = "\t method() {\n \t\t" + relationsText + "\n \t}";
        this.association.add(assocaitoString);
    }
    
    public void setInheritanceText(String relationsText) {
        String inherittoString = relationsText;
        this.inheritance.add(inherittoString);
    }
    
    public void setCompositionText(String relationsText) {
        String compositetoString = relationsText;
        this.composition.add(compositetoString);
    }
    

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

}
