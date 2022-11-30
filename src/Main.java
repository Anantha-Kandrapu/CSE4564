import javax.swing.*;

public class Main extends JFrame {

    public static void main(String[] args) {
        JMenu file, help;
        JMenuItem New, save, load, about;
        JFrame frame = new JFrame("SplitPaneFrame");
        JMenuBar mb = new JMenuBar();
        file = new JMenu("File");
        help = new JMenu("Help");
        about = new JMenuItem("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JOptionPane.showMessageDialog(frame, "                    Team: \n Anantha Ramayya Kandarpu  " +
                        "\n Paromita Roy \n Mohammed Danish Khan \n Shivanjay Wagh \n Pradeep Nagisetti \n " +
                        "Loka kalyan Balla");
            }
        });
        New = new JMenuItem("New");
        save = new JMenuItem("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String fileName = JOptionPane.showInputDialog(frame,
                        "Please Enter FileName?", null);
            }
        });
        load = new JMenuItem("Load");
        load.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String Name = JOptionPane.showInputDialog(frame,
                        "Please Enter FileName?", null);
            }
        });
        file.add(New);
        file.add(save);
        file.add(load);
        help.add(about);
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
