import javax.swing.*;

public class Main extends JFrame {

    public static void main(String[] args) {
        JMenu file, help;
        JMenuItem New, save, load, mem1, mem2, mem3, mem4, mem5, mem6;
        JFrame frame = new JFrame("SplitPaneFrame");
        JMenuBar mb = new JMenuBar();
        file = new JMenu("File");
        help = new JMenu("help");
        New = new JMenuItem("New");
        save = new JMenuItem("Save");
        load = new JMenuItem("Load");
        mem1 = new JMenuItem("Ananth");
        mem2 = new JMenuItem("Danish");
        mem3 = new JMenuItem("Paromita");
        mem4 = new JMenuItem("Loka");
        mem5 = new JMenuItem("mem5");
        mem6 = new JMenuItem("mem6");
        help.add(mem1);
        help.add(mem2);
        help.add(mem3);
        help.add(mem4);
        help.add(mem5);
        help.add(mem6);
        file.add(New);
        file.add(save);
        file.add(load);
        mb.add(file);
        mb.add(help);
        LeftPanel lp = new LeftPanel();
        RightPanel.getRightPanel();
        RightPanel.rightPanel.addSubscriber(lp);
        JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, lp, RightPanel.rightPanel);
        split.setDividerLocation(500);
        frame.getContentPane().add(split);
        frame.setJMenuBar(mb);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(2000, 1000);
        frame.setVisible(true);
    }
}
